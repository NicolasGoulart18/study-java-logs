
# CASE

O `CASE` é uma expressão condicional do SQL, semelhante ao `if/else` de linguagens de programação.

Ele permite **classificar ou transformar dados de acordo com condições**.

---

## Estrutura

* `WHEN` → Define a condição (**quando**).
* `THEN` → Define o resultado caso a condição seja verdadeira (**então**).
* `ELSE` → Define o resultado caso nenhuma condição seja atendida.
* `END AS` → Finaliza o `CASE` e define o nome da nova coluna.

### Sintaxe

```sql
CASE
    WHEN condição1 THEN resultado1
    WHEN condição2 THEN resultado2
    ELSE resultado_padrao
END AS nome_coluna
```

---

## Exemplo

```sql
SELECT id_colaborador, cargo, salario,
    CASE
        WHEN salario < 3000 THEN 'BAIXO'
        WHEN salario BETWEEN 3000 AND 6000 THEN 'MÉDIO'
        ELSE 'ALTO'
    END AS categoria_salario
FROM HistoricoEmprego
ORDER BY salario DESC;
```

### Explicação

O `CASE` verifica o salário de cada funcionário:

```text
salario < 3000       → BAIXO
3000 até 6000        → MÉDIO
acima de 6000        → ALTO
```

O resultado é uma **nova coluna** chamada `categoria_salario`.

---

## Aplicando cálculos

O `CASE` também pode ser usado para realizar cálculos condicionais:

```sql
SELECT PedidoID, TotalVenda,
    CASE
        WHEN TotalVenda > 500 THEN TotalVenda * 0.9
        WHEN TotalVenda BETWEEN 100 AND 500 THEN TotalVenda * 0.95
        ELSE TotalVenda
    END AS TotalComDesconto
FROM Pedidos;
```

Nesse exemplo:

* Acima de `500` → desconto de 10%.
* Entre `100` e `500` → desconto de 5%.
* Abaixo de `100` → sem desconto.

> **Resumo:** `CASE` permite criar regras condicionais dentro do SQL, sendo muito útil para **categorizar dados e realizar cálculos condicionais**.

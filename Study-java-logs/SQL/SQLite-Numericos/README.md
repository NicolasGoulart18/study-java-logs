# FUNÇÕES NUMÉRICAS

Funções utilizadas para realizar operações e manipulações com valores numéricos no SQL.

---

### ROUND

* **Funcionalidade:** Arredonda um número para a quantidade de casas decimais especificada.

* **Sintaxe:**

```sql
ROUND(valor, quantidade_de_casas)
```

* **Exemplo:**

```sql
SELECT 
    AVG(faturamento_bruto),
    ROUND(AVG(faturamento_bruto), 2)
FROM faturamento;
```

* **Explicação:**

    * `AVG(faturamento_bruto)` calcula a média do faturamento bruto.
    * `ROUND(..., 2)` arredonda o resultado da média para **2 casas decimais**.
    * O primeiro argumento do `ROUND` é o valor que será arredondado.
    * O segundo argumento indica quantas casas decimais serão mantidas.

---

### CEIL

* **Funcionalidade:** Arredonda um número **para cima**, retornando o menor número inteiro que seja maior ou igual ao valor informado.

* **Exemplo:**

```sql
SELECT 
    CEIL(faturamento_bruto),
    CEIL(despesas)
FROM faturamento;
```

* **Exemplo prático:**

```text
CEIL(10.2) → 11
CEIL(10.8) → 11
CEIL(10.0) → 10
```

---

### FLOOR

* **Funcionalidade:** Arredonda um número **para baixo**, retornando o maior número inteiro que seja menor ou igual ao valor informado.

* **Exemplo:**

```sql
SELECT 
    FLOOR(faturamento_bruto),
    FLOOR(despesas)
FROM faturamento;
```

* **Exemplo prático:**

```text
FLOOR(10.2) → 10
FLOOR(10.8) → 10
FLOOR(10.0) → 10
```

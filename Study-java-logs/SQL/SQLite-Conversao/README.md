# CONVERSÃO — CAST

O `CAST` é usado para **converter um valor de um tipo de dado para outro**.

Por exemplo, podemos converter um número para `TEXT` (texto).

---

## Sintaxe

```sql
CAST(valor AS tipo_de_dado)
```

### Exemplo:

```sql
SELECT 
    'Faturamento bruto médio: ' || 
    CAST(ROUND(AVG(faturamento_bruto), 2) AS TEXT)
FROM faturamento;
```

---

## Explicação

* `SELECT` → Inicia a consulta.
* `'Faturamento bruto médio: '` → Texto que será exibido no resultado.
* `||` → Operador utilizado para **concatenar** valores no SQLite.
* `AVG()` → Calcula a **média** dos valores.
* `faturamento_bruto` → Coluna utilizada para calcular a média.
* `ROUND(..., 2)` → Arredonda o resultado para **2 casas decimais**.
* `CAST(... AS TEXT)` → Converte o resultado numérico para **texto**.
* `FROM faturamento` → Define a tabela de onde os dados serão obtidos.

### Ordem das funções

```text
faturamento_bruto
       ↓
     AVG()
       ↓
    ROUND()
       ↓
     CAST()
       ↓
    TEXT
```

---

## Resultado

```text
Faturamento bruto médio: 129835.04
```

---

## Outros exemplos

### Converter número para texto

```sql
SELECT CAST(100 AS TEXT);
```

Resultado:

```text
100
```

### Converter texto para número inteiro

```sql
SELECT CAST('100' AS INTEGER);
```

Resultado:

```text
100
```

### Converter texto para número decimal

```sql
SELECT CAST('99.90' AS REAL);
```

Resultado:

```text
99.9
```

> **Resumo:** `CAST` é utilizado quando precisamos **alterar o tipo de um valor** dentro da consulta.

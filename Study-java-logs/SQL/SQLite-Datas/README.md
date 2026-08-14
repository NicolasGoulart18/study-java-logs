# SQLite — Alura

Área para estudos de SQLite: `SELECT`, `WHERE`, `JOIN`, `GROUP BY`, subqueries e modelagem.

---

## 📅 DATE

### Funcionalidade

A função `DATE` é usada para extrair a data de um valor de data e hora ou para obter a data atual.

Ela retorna a data no formato `YYYY-MM-DD`.

### Sintaxe básica

```sql
DATE('now', '[modificador]')
```

### Exemplos de uso

#### Data atual

```sql
SELECT DATE('now');
```

#### 10 dias antes

```sql
SELECT DATE('now', '-10 days');
```

### STRFTIME

Essa função permite **mostrar a data da forma que eu quiser**, como mês/ano, ano/mês, dia/mês, entre outras formas.

**Exemplo:**

```sql
SELECT id_colaborador, STRFTIME('%m,%Y', dataInicio)
FROM linceça;
```

Retorna a data de início no formato mês/ano do ID do colaborador.

### JULIANDAY

Essa função serve para trabalhar com **cálculos de tempo**, por exemplo, calcular o tempo de contrato.

**Exemplo:**

```sql
SELECT
    id_colaborador,
    JULIANDAY(dataTermino) - JULIANDAY(dataContratacao)
FROM historicoEmprego
WHERE dataTermino IS NOT NULL;
```

Retorna os dias trabalhados por cada funcionário que saiu da empresa.

Se eu quisesse deixar mais específica, poderia fazer:

```sql
SELECT
    id_colaborador,
    JULIANDAY(dataTermino) - JULIANDAY(dataContratacao)
FROM HistoricoEmprego
WHERE dataTermino IS NOT NULL
  AND JULIANDAY(dataTermino) - JULIANDAY(dataContratacao) < 365
ORDER BY JULIANDAY(dataTermino) - JULIANDAY(dataContratacao) ASC;
```

Dessa forma, vai retornar valores X em ordem crescente, o que seria melhor para a empresa.

---

## 🕐 TIME

### Funcionalidade

A função `TIME` é usada para extrair a hora de um valor de data e hora ou para obter a hora atual.

Ela retorna a hora no formato `HH:MM:SS`.

### Sintaxe básica

```sql
TIME('now', '[modificador]')
```

### Exemplo de uso

#### Para obter a hora atual

```sql
SELECT TIME('now');
```

---

## 📅 DATETIME

### Funcionalidade

`DATETIME` é uma função mais abrangente que retorna tanto a data quanto a hora no formato:

`YYYY-MM-DD HH:MM:SS`

Pode ser usada para obter o momento atual ou converter/modificar valores de data e hora existentes.

### Sintaxe básica

```sql
DATETIME('now', '[modificador]')
```

### Exemplos de uso

#### Data atual e hora atual

```sql
SELECT DATETIME('now');
```

#### Data e hora exatas a 1 ano no futuro

```sql
SELECT DATETIME('now', '+1 year');
```

---

## ⏱️ CURRENT_TIMESTAMP

### Funcionalidade

`CURRENT_TIMESTAMP` é uma função de conveniência que retorna a data e hora atuais no formato:

`YYYY-MM-DD HH:MM:SS`

É equivalente a usar `DATETIME('now')`.

### Sintaxe básica

```sql
CURRENT_TIMESTAMP
```

### Exemplo de uso

#### Para obter o timestamp atual

```sql
SELECT CURRENT_TIMESTAMP;
```

# RENAME AND GOOD PRACTICES

O `RENAME TO` é utilizado para **renomear tabelas** no banco de dados.

---

## RENAME

### Sintaxe

```sql
ALTER TABLE nome_atual
RENAME TO novo_nome;
```

### Exemplo

```sql
ALTER TABLE historico_emprego
RENAME TO cargos_colaboradores;
```

> O conteúdo e os dados da tabela são mantidos. Apenas o nome é alterado.

---

## Boas práticas de nomenclatura

Uma boa nomenclatura facilita a **leitura, manutenção e organização** do banco de dados.

### 1. Clareza

Use nomes que indiquem claramente o que a tabela ou coluna representa.

```text
❌ dados
✅ clientes
✅ data_nascimento
```

Evite abreviações pouco claras.

---

### 2. Consistência

Escolha um padrão e mantenha-o em todo o banco.

Por exemplo, utilizando `snake_case`:

```text
clientes
historico_emprego
data_nascimento
id_cliente
```

Evite misturar padrões:

```text
❌ idCliente
❌ ClienteID
❌ ID_cliente
```

---

### 3. Evite palavras reservadas

Não utilize palavras reservadas do SQL como nomes de tabelas ou colunas.

```text
❌ SELECT
❌ TABLE
❌ DATE
```

---

### 4. Seja específico

O nome deve deixar claro o significado da informação.

```text
❌ data
✅ data_nascimento
✅ data_contratacao
```

Para chaves estrangeiras, mantenha um padrão:

```text
id_cliente
id_produto
id_funcionario
```

---

### 5. Evite espaços

Não utilize espaços nos nomes. Prefira `_` para separar palavras:

```text
❌ data nascimento
✅ data_nascimento
```

---

### 6. Mantenha um idioma

Escolha um idioma para os nomes e mantenha o padrão em todo o banco.

Por exemplo, tudo em inglês:

```text
customers
employees
birth_date
customer_id
```

ou tudo em português:

```text
clientes
funcionarios
data_nascimento
id_cliente
```

> **Resumo:** escolha nomes **claros, consistentes, específicos e simples**, evitando espaços, abreviações confusas e palavras reservadas do SQL.

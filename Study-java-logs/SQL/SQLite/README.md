# SQLite - Alura


Área para estudos de SQLite: SELECT, WHERE, JOIN, GROUP BY, subqueries e modelagem.

# DATA 
  - ### STRFTIME
    -   Essa função permite-me "Mostrar" a data da forma que eu quiser, mes/ano,ano/mes,dia/mes, de qualquer forma
    - Exemplo:
      - SELECT id_colaborador,STRFTIME('%m,%Y',dataInicio) FROM linceça
      - Retorna a data de início no formato mes/ano do id do colaborador


  - ### JULIANDAY
    - Essa função serve para trabalhar calculo de tempo, por exemplo, tempo de contrato
    - Exemplo:
      - SELECT id_colaborador, JULIANDAY(dataTermino)-JULIANDAY(dataContratacao) FROM historicoEmprego WHERE dataTermino IS NOT NULL
      - Retorna os dias trabalhados por cada funcionario que saiu da empresa
      - Se eu quisesse deixar mais especifica poderia fazer:
        - SELECT id_colaborador, JULIANDAY (datatermino)-JULIANDAY (datacontratacao)
          FROM HistoricoEmprego
          WHERE datatermino is NOT NULL
          AND  JULIANDAY (datatermino)-JULIANDAY (datacontratacao) <365
          ORDER by JULIANDAY (datatermino)-JULIANDAY (datacontratacao) ASC;
        - Dessa forma vai retornar valores X em ordem crescente que seria melhor para empresa.
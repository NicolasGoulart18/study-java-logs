# SQLite - Alura


Área para estudos de SQLite: SELECT, WHERE, JOIN, GROUP BY, subqueries e modelagem.

# DATA  
    Funcionalidade: A função DATE é usada para extrair a data de um valor de data e hora
    ou para obter a data atual. Ela retorna a data no formato 'YYYY-MM-DD'.
    Sintaxe Básica: DATE('now', '[modificador]')
    Exemplos de Uso:


-   ### DATA ATUAL
    - SELECT DATE('now');
    - ### 10DIAS ANTES
    - SELECT DATE('now', '-10 days');
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
        
# TIME
    Funcionalidade: A função TIME é usada para extrair a hora de um valor de data e hora ou para obter a hora atual. Ela retorna a hora no formato 'HH:MM:SS'.
    Sintaxe Básica: TIME('now', '[modificador]')
    Exemplo de Uso: 
###  Para obter a hora atual:

-     SELECT TIME('now');

# DATATIME
    Funcionalidade: DATETIME é uma função mais abrangente que retorna tanto a data quanto
    a hora no formato 'YYYY-MM-DD HH:MM:SS'. 
    Pode ser usada para obter o momento atual ou converter/modificar valores de data e hora existentes.
    Sintaxe Básica: DATETIME('now', '[modificador]')
    Exemplo de Uso: Para obter a data e hora atuais:

### DATA ATUAL E HORA ATUAL:
      SELECT DATETIME('now');
### DATA E HORA EXATAS A 1 ANO NO FUTURO:
        SELECT DATETIME('now', '+1 year');  
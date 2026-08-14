
# FUNÇÕES NUMERICAS


### ROUND
    - funcionalidade: Arredondar valores para cima
    - Exemplo: 
        -SELECT AVG (faturamento_bruto), ROUND (AVG(faturamento bruto),2) FROM FATURAMENTO
            -Nessa caso eu usei avg para pegar a media do faturamento bruto e usei o 
            round para arredondar dentro do roud usei novamento o AVG faturamento bruto e
            fora desse primeiro parentese usei 2 para mostrar que sao duas cass decimasi


### CEIL
    - Funcionalidade: Arrendo para o maior inteiro
    -Exemplo:
    
 ````sql
    SELECT CEIL (faturamento_bruto), CEIL (despesas) FROM faturamento;

   ```´´´´ 

### FLOOR

     - Funcionalidade: Arrendo para o menor inteiro
    -Exemplo:
    
 ````sql
    SELECT FLOOR (faturamento_bruto), FLOOR (despesas) FROM faturamento;

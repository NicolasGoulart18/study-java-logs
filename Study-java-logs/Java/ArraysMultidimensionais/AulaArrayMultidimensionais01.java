package ArraysMultidimensionais;

public class AulaArrayMultidimensionais01 {
    static void main(String[] args) {
         int [][]dias = new int [3][4];
         //Atribuição de todos arrays
        dias [0][0]=1;
        dias [0][1]=2;
        dias [0][2]=3;
        dias [0][3]=4;

        dias [1][0]=5;
        dias [1][1]=6;
        dias [1][2]=7;
        dias [1][3]=8;

        dias [2][0]=9;
        dias [2][1]=10;
        dias [2][2]=11;
        dias [2][3]=12;

        // A forma de navegar ele navega o array por meio de for aninhados

        for (int i = 0; i < dias.length ; i++) {
        //Nesse primeiro for ele navega pelo primeiro array, que seria a posição 0
            for (int j = 0; j <dias[i].length ; j++) {
                //ja nesse array ele navega dentro da posicao 0 que faz referencia ao 2 array
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("-------------------------");

        //Usando for-each ele vai pegar cada uma das posições e criar uma variavel de referencia
        // Só criar uma variavel inteira de referencia array
        for(int []arrBase:dias){
            for (int num: arrBase){
                System.out.println(num);
            }
        }

    }
}

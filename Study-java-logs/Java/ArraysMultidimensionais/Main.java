package ArraysMultidimensionais;

public class Main {
    static void main(String[] args) {
         int [][]dias = new int [3][3];
         dias [0][0]=12;
         dias [0][1]=18;
         dias [0][2]=14;


        dias [1][0]=2;
        dias [1][1]=8;
        dias [1][2]=4;

        // A forma de navegar ele navega o array por meio de for aninhados

        for (int i = 0; i < dias.length ; i++) {
        //Nesse primeiro for ele navega pelo primeiro array, que seria a posição 0
            for (int j = 0; j <dias[0].length ; j++) {
                //ja nesse array ele navega dentro da posicao 0 que faz referencia ao 2 array
                System.out.println(dias[i][j]);
            }
        }
    }
}

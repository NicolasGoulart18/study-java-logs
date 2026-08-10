package ArraysMultidimensionais;

public class ArrayMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        int[] array = {2, 3, 4};

        //Forma de inicialzação quando o array multidimensional o "j" é null
        //Declaro um objeto para ele
        /*Posso declara dessa forma tbm:
          int[] array={1,2,3};
          int [][] arrayInt= new int[3][];
          arrayInt[1]=array

         */
        arrayInt[0] = new int[1];
        arrayInt[0][0] = 1;

        arrayInt[1] = array;
        /*arrayInt[1][0]=2;
        arrayInt[1][1]=3;
        arrayInt[1][2]=4;

         */

        arrayInt[2] = new int[6];
        arrayInt[2][0] = 5;
        arrayInt[2][1] = 6;
        arrayInt[2][2] = 7;
        arrayInt[2][3] = 8;
        arrayInt[2][4] = 9;
        arrayInt[2][5] = 10;


        //Dessa 3 forma, eu declaro as quantidades de posições e dentro dela os valores de referencia
        int [][] arrayInt2= {{0,0},{1,2,3},{1,2,3,4,5,6,}};


        //Se eu quiser fazer com for I faço assim:
        for (int i = 0; i < arrayInt2.length; i++) {
            for (int j = 0; j < arrayInt2[i].length; j++) {
                System.out.println(arrayInt2[i][j]);
            }
        }



        System.out.println("------------------------------------");

        //Dessa forma da erro pois a variavel de referencia qnd nao tem nada
        // consta como null
        //Array e sempre uma variable de referencia ou seja um objeto

        //Se eu quiser fazer usando for-each
        for (int[] arrBase : arrayInt2) {
            System.out.println("\n---------");
            for (int num : arrBase)
                System.out.println(num);

        }
    }
}

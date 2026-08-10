package ArraysMultidimensionais;

public class ArrayMultidimensionais02 {
    public static void main(String[] args) {
        int [] [] arrayInt=new int[3][4];

        //Atribuição de todos arrays
        arrayInt [0][0]=1;
        arrayInt [0][1]=2;
        arrayInt [0][2]=3;
        arrayInt [0][3]=4;

        arrayInt [1][0]=5;
        arrayInt [1][1]=6;
        arrayInt [1][2]=7;
        arrayInt [1][3]=8;

        arrayInt [2][0]=9;
        arrayInt [2][1]=10;
        arrayInt [2][2]=11;
        arrayInt [2][3]=12;

        //Se eu quiser fazer com for I faço assim:
        for (int i = 0; i <arrayInt.length ; i++) {
            for (int j = 0; j < arrayInt[i].length ; j++) {
                System.out.println(arrayInt[i][j]);
            }
        }


                                                                     //Dessa forma da erro pois a variavel de referencia qnd nao tem nada
                                                                    //consta como null
                                                                    //Array e sempre uma variable de referencia ou seja um objeto
       //Se eu quiser fazer usando for-each
        for(int[]arrBase:arrayInt){
            for (int num:arrBase)
                System.out.println(num);

        }
    }
}

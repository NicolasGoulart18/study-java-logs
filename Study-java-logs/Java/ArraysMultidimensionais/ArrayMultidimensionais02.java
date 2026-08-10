package ArraysMultidimensionais;

public class ArrayMultidimensionais02 {
    public static void main(String[] args) {
        int [] [] arrayInt=new int[3][3];

        arrayInt [0][0]=1;
        arrayInt [0][1]=2;
        arrayInt [0][2]=3;

        arrayInt [1][0]=4;
        arrayInt [1][1]=5;
        arrayInt [1][2]=6;

        arrayInt [2][0]=7;
        arrayInt [2][1]=8;
        arrayInt [2][2]=9;




        //Dessa forma da erro pois a variavel de referencia qnd nao tem nada
        // consta como null
        //Array e sempre uma variable de referencia ou seja um objeto
        for(int[]arrBase:arrayInt){
            for (int num:arrBase)
                System.out.println(num);

        }
    }
}

package POO.MetodosDevDojo.dominio;

public class Calculadora {
    public void somarDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtrairDoisNumero(){
        System.out.println(21-2);
    }

    //Parametros são variavles locais que vao estar vivas durante o contexto
    public void multiplicaDoisNumero(int num1, int num2){
        System.out.println(num1*num2);
    }

}

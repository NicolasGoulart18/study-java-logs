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

    public double divideDoisNumeros(double num1,double num2) {
        if(num2==0){
            return 0;
        }
        return (num1/num2);
    };

    public double divideDoisNumeros2(double num1,double num2){
        if(num2 !=0){
            return (num1/num2);
        }
        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if(num2==0){
            System.out.println("Nao existe divisão por zero");
            return;
        }else{
            System.out.println(num1/num2);
        }
    }

}

package POO.MetodosDevDojo.test;

import POO.MetodosDevDojo.dominio.Calculadora;

public class CalculadoraTest02 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        // Na hora que eu vou passar os parametros, ele é chamado de argumento!
        calculadora.multiplicaDoisNumero(12,33);
        System.out.println(calculadora.divideDoisNumeros(10,5));

        }
}

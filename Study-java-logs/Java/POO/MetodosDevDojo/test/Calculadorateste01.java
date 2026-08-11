package POO.MetodosDevDojo.test;

import POO.MetodosDevDojo.dominio.Calculadora;

public class Calculadorateste01 {
    static void main(String[] args) {
        // Os metodos tbm sao executados no objeto
        Calculadora calculadora = new Calculadora();
        calculadora.somarDoisNumeros();
        calculadora.subtrairDoisNumero();
    }
}

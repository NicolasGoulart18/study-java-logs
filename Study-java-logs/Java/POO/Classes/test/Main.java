package POO.Classes.test;

import POO.Classes.dominio.Carro;

public class Main {
    static void main(String[] args) {

        Carro carro1 = new Carro();

        Carro carro2 = new Carro();

        /*
            Eu posso fazer essa referencia de objeto:
                carro1 =carro2;
                ai o carro 1 começa a buscar os atributos do endereço de memoria do carro2
                Mas só pode ser feito com objetos do mesmo tipo, nn posso fazer carro1=professor;
         */

        carro1.nome="Chevrolet Onix";
        carro1.modelo="Onix";
        carro1.ano=2019;

        carro2.nome="Ford Mustang";
        carro2.modelo="Mustang";
        carro2.ano=1967;

        System.out.println("Carro 1:");
        System.out.println("Carro: "+carro1.nome+" Modelo: "+carro1.modelo+" Ano: "+carro1.ano);
        System.out.println();
        System.out.println("Carro 2:");
        System.out.println("Carro: "+carro2.nome+" Modelo: "+carro2.modelo+" Ano: "+carro2.ano);
    }
}

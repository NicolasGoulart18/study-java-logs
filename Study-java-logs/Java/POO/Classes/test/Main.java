package POO.Classes.test;

import POO.Classes.dominio.Carro;

public class Main {
    static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome="Chevrolet Onix";
        carro1.modelo="Onix";
        carro1.ano=2019;

        carro2.nome="Ford Mustang";
        carro2.modelo="Mustang";
        carro2.ano=1967;

        System.out.println("Carro: "+carro1.nome+" Modelo: "+carro1.modelo+" Ano: "+carro1.ano);
        System.out.println();
        System.out.println("================================================");
        System.out.println();
        System.out.println("Carro: "+carro2.nome+" Modelo: "+carro2.modelo+" Ano: "+carro2.ano);
    }
}

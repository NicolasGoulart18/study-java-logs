package POO.Classes.test;

import POO.Classes.dominio.Professor;

public class Professor01 {
    static void main(String[] args) {
        Professor professor =new Professor();
        professor.nome="Jiraya";
        professor.idade=45;
        professor.sexo='M';
        System.out.println("Nome: "+professor.nome+" idade: "+professor.idade+" sexo: "+professor.sexo);
    }
}

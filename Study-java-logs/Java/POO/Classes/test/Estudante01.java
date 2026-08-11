package POO.Classes.test;

import POO.Classes.dominio.Estudante;

public class Estudante01 {
    static void main(String[] args) {
        /*Aq eu instanciei um objeto
        Estudante é minha classe, estudante minha variavel de referencia

        Essa variable de referencia e como se fosse um controle, ela aponta para um objeto
        objeto esse que estara o dado real

        Vale lembro: Estudante ->Tipo
                     estudante ->variable de referencia
                     new Estudante -> Crianção de objeto

                     O objeto é criado pelo "new Estudante()" e é nele que ficam
                     os dados (estado) daquela instância.
         */
        Estudante estudante = new Estudante();
        estudante.nome = "Sasuke";
        estudante.idade = 17;
        estudante.sexo = 'M';

        /*
            Quando eu faço estudante. -> Minha variable de referencia vai chamar o atributo
         */
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
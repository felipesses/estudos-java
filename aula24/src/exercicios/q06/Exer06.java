package exercicios.q06;

import exercicios.q05.ContaCorrente;

public class Exer06 {
    public static void main(String[] args) {
        Contato contato = new Contato();


       contato.nome = "Felipe";
       contato.email = "f@gmail.com";
       contato.endereco = "Rua";

       contato.telefones = new String[2];

       contato.telefones[0] = "8424824";
       contato.telefones[1] = "4824924";

        System.out.println("Nome do contato: " + contato.nome);

    }
}

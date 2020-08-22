package exercicios.q04;

import exercicios.q03.LivroLivraria;

import java.util.Date;

public class Exer04 {

    public static void main(String[] args) {
        LivroBiblioteca livro = new LivroBiblioteca();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane";
        livro.anoLancamento = 2015;
        livro.preco = 30.00;
        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoA = "Felipe";

        System.out.println("Nome do Livro: " + livro.nome);

    }
}

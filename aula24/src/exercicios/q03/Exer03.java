package exercicios.q03;

import exercicios.q01.Lampada;

public class Exer03 {
    public static void main(String[] args) {
        LivroLivraria livro = new LivroLivraria();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane";
        livro.anoLancamento = 2015;

        livro.preco = 30.00;

        System.out.println("Nome do Livro: " + livro.nome);

    }
}

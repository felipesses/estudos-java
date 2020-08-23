package exercicios.q03;

public class Aluno {
    String nome;
    int numeroMatricula;
    String nomeCurso;
    String[] disciplinas = new String[3];
    double[][] notasDisciplinas = new double[3][4];

    void mostrarInfo() {
        System.out.println("Nome do aluno: "+ nome);
        System.out.println("Matricula: " + numeroMatricula);
        System.out.println("Nome do curso: " + nomeCurso);

        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + disciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.println(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean  verificarAprovacao(int indice) {

        double soma = 0;

        for (int i = 0; i < notasDisciplinas[indice].length; i++){
            soma += notasDisciplinas[indice][i];
        }

        double media = soma/4;

        if (media >= 7)
            return true;

        return false;

    }
}

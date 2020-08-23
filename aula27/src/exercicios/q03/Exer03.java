package exercicios.q03;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Informe o nome do aluno");
        aluno.nome = sc.next();

        System.out.println("Informe o nome do curso");
        aluno.nomeCurso = sc.next();

        System.out.println("Informe o numero da matricula");
        aluno.numeroMatricula = sc.nextInt();


        for (int i = 0; i < aluno.disciplinas.length; i++) {
            System.out.println("Nome da disciplina " + (i + 1));
            aluno.disciplinas[i] = sc.next();
        }

        for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
            System.out.println("Obtendo notas da disciplina " + aluno.disciplinas[i]);
            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
                System.out.println("Entre com a nota " + (j+1));
                aluno.notasDisciplinas[i][j] = sc.nextDouble();
            }
        }

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.disciplinas.length; i++) {
            if (aluno.verificarAprovacao(i)) {
                System.out.println("Aluno aprovado na disciplina: " + aluno.disciplinas[i]);
            } else
                System.out.println("Aluno reprovado na disciplina " + aluno.disciplinas[i]);
        }
    }
}

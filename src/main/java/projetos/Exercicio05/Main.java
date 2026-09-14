package projetos.Exercicio05;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        double notaFinal = 0;
        double media = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantidade de alunos: ");
        int alunos = scanner.nextInt();

        for (int i = 1; i <= alunos; i++) {

            System.out.println("Nome do aluno: ");
            String nome = scanner.next();

            System.out.println("===== Materia(s) =====");
            System.out.println("Nota de português: ");
            double portugues = scanner.nextDouble();

            System.out.println("Nota de Matemática: ");
            double matematica = scanner.nextDouble();

            notaFinal = (portugues + matematica) /2;
            media = media + notaFinal;

            if (notaFinal >= 7) { System.out.printf("Aluno(a) %s foi Aprovado(a) com nota: %.2f%n", nome, notaFinal); }

            else if (notaFinal >= 5 && notaFinal < 7) { System.out.printf("Aluno(a) %s foi para Recuperação com nota: %.2f%n", nome, notaFinal); }

            else if (notaFinal < 5) { System.out.printf("Aluno(a) %s foi Reprovado(a) com nota: %.2f%n", nome, notaFinal); } }

        media = media / alunos;
        System.out.println("Quantidade de Alunos: " + alunos );
        System.out.println("A média da turma foi: " + media);

    }
}

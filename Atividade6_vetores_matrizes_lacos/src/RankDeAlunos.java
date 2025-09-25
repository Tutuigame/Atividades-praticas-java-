import java.util.Scanner;

public class RankDeAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] notas = new double[5][2];
        double[] medias = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite as duas notas do aluno " + (i+1) + ":");
            for (int j = 0; j < 2; j++) {
                System.out.print("Nota " + (j+1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
            medias[i] = (notas[i][0] + notas[i][1]) / 2.0;
        }
        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Aluno %d - Média: %.2f%n", (i+1), medias[i]);
        }
    }
}

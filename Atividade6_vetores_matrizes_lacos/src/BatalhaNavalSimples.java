import java.util.Random;
import java.util.Scanner;

public class BatalhaNavalSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        char[][] mar = new char[7][7];
        boolean[][] navios = new boolean[7][7];

        //comeca com agua
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                mar[i][j] = '~';
                navios[i][j] = false;
            }
        }

        //sorteia navio
        int naviosRestantes = 3;
        int colocados = 0;
        while (colocados < 3) {
            int linha = rand.nextInt(7);
            int coluna = rand.nextInt(7);
            if (!navios[linha][coluna]) {
                navios[linha][coluna] = true;
                colocados++;
            }
        }

        //loop
        while (naviosRestantes > 0) {
            System.out.println("\nTabuleiro:");
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    System.out.print(mar[i][j] + " ");
                }
                System.out.println();
            }

            // Jogada do usuário
            System.out.print("\nDigite a linha (0-6): ");
            int linha = sc.nextInt();
            System.out.print("Digite a coluna (0-6): ");
            int coluna = sc.nextInt();

            if (linha < 0 || linha > 6 || coluna < 0 || coluna > 6) {
                System.out.println("Posição inválida! Tente novamente.");
                continue;
            }
            if (navios[linha][coluna]) {
                System.out.println("Acertou um navio!");
                mar[linha][coluna] = 'X';
                navios[linha][coluna] = false;
                naviosRestantes--;
            } else {
                System.out.println("Água!");
                mar[linha][coluna] = 'O';
            }
        }

        System.out.println("\nParabéns! Você afundou todos os navios!");
        System.out.println("Tabuleiro final:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(mar[i][j] + " ");
            }
            System.out.println();
        }
    }
}

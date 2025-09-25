import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] tabuleiro = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '-';
            }
        }

        char jogadorAtual = 'X';

        for (int jogada = 0; jogada < 9; jogada++) {
            System.out.println("\nJogador " + jogadorAtual + ", escolha posição:");
            System.out.print("Linha (0-2): ");
            int linha = sc.nextInt();
            System.out.print("Coluna (0-2): ");
            int coluna = sc.nextInt();

            if (tabuleiro[linha][coluna] == '-') {
                tabuleiro[linha][coluna] = jogadorAtual;
            } else {
                System.out.println("Posição já ocupada! Tente de novo.");
                jogada--;
                continue;
            }

            System.out.println("\nTabuleiro:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j] + " ");
                }
                System.out.println();
            }
            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }
    }
}

import java.util.Scanner;

public class PreenchimentoDeMatriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o número para a posição [" + (i+1) + ", " + (j+1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("A matriz 3x3 é:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        }

    }


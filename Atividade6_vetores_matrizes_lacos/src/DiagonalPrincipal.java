import java.util.Random;

public class DiagonalPrincipal {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz4x4 = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz4x4[i][j] = random.nextInt(100) + 1;
            }
        }

        System.out.println("Matriz 4x4 gerada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz4x4[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Elementos da diagonal principal: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz4x4[i][i] + " ");
        }
    }
}

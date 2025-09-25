import java.util.Scanner;

public class MaiorMenor {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}

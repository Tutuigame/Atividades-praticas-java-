import java.util.Random;

public class ParEÍmpar {

    public static void main(String[] args) {

        int[] numeros = new int[15];
        Random sortear = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sortear.nextInt(100);

            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " - É um número PAR!!");
            } else {
                System.out.println(numeros[i] + " - É ímpar!");
            }
        }
    }
}
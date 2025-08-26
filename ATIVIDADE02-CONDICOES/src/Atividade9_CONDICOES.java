import java.util.Scanner;

public class Atividade9_CONDICOES {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número: ");
        double num = scanner.nextDouble();

        if (num >= 1) {
            System.out.println("Positivo");
        } else if (num == 0) {
            System.out.println("Zero");
        } else if (num < 0) {
            System.out.println("Negativo");
        }
    }
}
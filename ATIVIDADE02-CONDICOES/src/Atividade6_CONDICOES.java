import java.util.Scanner;

public class Atividade6_CONDICOES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua média final: ");
        double mediaFinal = scanner.nextDouble();
        if (mediaFinal >= 7) {
            System.out.println("Aprovado!!");
        } else if (mediaFinal >= 5 && (mediaFinal < 7)) {
            System.out.println("Recuperação");
        } else if (mediaFinal < 5) {
            System.out.println("Reprovado!!!");
        }
    }
}

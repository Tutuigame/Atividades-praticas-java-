import java.util.Scanner;

public class Atividade8_CONDICOES {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Graus Celcius: ");
        int temperatura = scanner.nextInt();

        if (temperatura > 30) {
            System.out.println("Quente!!!");
        } else if (temperatura >= 15) {
            System.out.println("Agradável");
        } else {
            System.out.println("Frio");
        }
    }
}

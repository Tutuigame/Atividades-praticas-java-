import java.util.Scanner;

public class Atividade7_CONDICOES {
    public static void main(String[] args) {

        double resultado;

        System.out.println("Insira o primeiro número: ");
        double num1 = new Scanner(System.in).nextDouble();
        System.out.println("Escolha a operação: ");
        char operacao = new Scanner(System.in).next().charAt(0);
        System.out.println("Insira o segundo número: ");
        double num2 = new Scanner(System.in).nextDouble();

        if (operacao == '+') {
            resultado = num1 + num2;
        } else if (operacao == '-') {
            resultado = num1 - num2;
        } else if (operacao == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Não é possivel dividir números por 0. Por favor tente novamente");
                return;
            }
        } else if (operacao == '*') {
            resultado = num1 * num2;
        } else {
            System.out.println("Operação invalida. Por favor tente novamente, usando os caracteres de cada operação!");
            return;
        }
        System.out.println("O resultado é: " + resultado);
    }
}

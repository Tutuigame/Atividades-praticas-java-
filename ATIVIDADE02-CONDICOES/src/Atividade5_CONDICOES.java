import java.util.Scanner;

public class Atividade5_CONDICOES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia: ");
        int diaSemana = scanner.nextInt();
        String nomeDia = switch (diaSemana) {
            case 1 -> "Segunda-feira";
            case 2 -> "Terça-feira";
            case 3 -> "Quarta-feira";
            case 4 -> "Quinta-feira";
            case 5 -> "Sexta-feira";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Dia inválido. Por favor, tente novamente com números de 1 a 7";
        };
        System.out.println(nomeDia);
    }
}

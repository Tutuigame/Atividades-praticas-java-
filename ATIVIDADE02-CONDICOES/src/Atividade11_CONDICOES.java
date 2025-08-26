import java.util.Scanner;

public class Atividade11_CONDICOES {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de anos trabalhados: ");
        double anosTrabalhados = scanner.nextDouble();
        System.out.println("Digite o valor do seu salário bruto: ");
        double salarioBruto = scanner.nextDouble();


        if (anosTrabalhados >= 10) {
            System.out.println("Bonificação de 10% aplicada!! Seu salário ficou: R$" + (salarioBruto + ((salarioBruto * 10) / 100)));
        } else if (anosTrabalhados >= 5 && anosTrabalhados < 10) {
            System.out.println("Bonificação de 5% aplicada!! Seu salário ficou: R$" + (salarioBruto + ((salarioBruto * 5) / 100)));
        }else{
            System.out.println("Sem bonificação :(, seu salário ficou: R$" + salarioBruto);
        }

        if (salarioBruto >= 5000.00) {
            System.out.println("Imposto de 27% aplicado!! Seu salário ficou: R$" + (salarioBruto - ((salarioBruto * 27) / 100)));
        } else if (salarioBruto >= 3000.00 && salarioBruto < 4999.99) {
            System.out.println("Imposto de 18% aplicado!! Seu salário ficou: R$" + (salarioBruto - ((salarioBruto * 18) / 100)));
        }else{
            System.out.println("Imposto de 10% aplicado!! Seu salário ficou: R$" + (salarioBruto - ((salarioBruto * 10) / 100)));
        }
    }
}

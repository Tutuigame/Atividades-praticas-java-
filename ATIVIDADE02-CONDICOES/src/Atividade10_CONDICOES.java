import java.util.Scanner;

public class Atividade10_CONDICOES {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor total da compra: ");
        double vlrTotal = scanner.nextDouble();

        if (vlrTotal >= 500.00) {
            System.out.println("Desconto de 20% aplicado!! Sua compra ficou: R$" + (vlrTotal - ((vlrTotal * 20) / 100)));
        } else if (vlrTotal >= 200.00 && vlrTotal < 500.00) {
            System.out.println("Desconto de 10% aplicado!! Sua compra ficou: R$" + (vlrTotal - ((vlrTotal * 10) / 100)));
        }else if (vlrTotal >= 100.00 && vlrTotal < 199.99) {
            System.out.println("Desconto de 5% aplicado!! Sua compra ficou: R$" + (vlrTotal - ((vlrTotal * 5) / 100)));
        }else{
            System.out.println("Sem desconto, sua compra ficou: R$" + vlrTotal);
        }
    }
}

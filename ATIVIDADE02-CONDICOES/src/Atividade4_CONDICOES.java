import java.util.Scanner;

public class Atividade4_CONDICOES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu Usuário: ");

        String user = scanner.nextLine();
        System.out.println("Digite sua senha: ");

        String senha = scanner.nextLine();

        if (user.equals("Arthur") && senha.equals("123456")) {
            System.out.println("Bem vindo");
        } else {
            System.out.println("Login incorreto!!");
        }
    }
}
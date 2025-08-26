import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Atividade01_ManipulacaoVariavel {

    public static void main(String[] args) {
    //Adicionando scanner
    Scanner scanner = new Scanner(System.in);

    int idade = 18;
    double altura = 1.80;
    String nome = "Arthur";
    boolean estudante = true;
    //Saudação com o nome acima
    System.out.println("Olá " + nome + "!");

    //Lendo as idades
    System.out.println("Digite a primeira idade: ");
    int idade1 = scanner.nextInt();

    System.out.println("Digite a segunda idade: ");
    int idade2 = scanner.nextInt();

    //Criando variavel para soma das idades
    int somaIdade = idade1 + idade2;

    //Imprimindo todos os dados
    System.out.println("Idade: " + idade);
    System.out.println("Altura: " + altura);
    System.out.println("Nome: " + nome);
    System.out.println("É estudante?: " + estudante);
    System.out.println("A soma das idades é: " + somaIdade);
    System.out.println("A altura dobrada é: " + (altura*2));

    }
}

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Atividade02_ManipulacaoVariavel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome = "Arthur";
        int idade = 18;
        double salarioBruto = 2500.00;
        int quantMesesTrabalhados = 12;
        int prodComprados = 20;
        double valorTotalProdutos = 100.00;
        double descontoAnual = 2000.00;
        double salarioAnualBruto = (salarioBruto * quantMesesTrabalhados);
        double salarioAnualLiquido = salarioAnualBruto - descontoAnual;
        double mediaValorProdutos = (valorTotalProdutos / prodComprados);

        System.out.println("Seu salário anual Bruto é: " + salarioAnualBruto);
        System.out.println("Seu salário anual com os descontos é: " + salarioAnualLiquido);
        System.out.println("Seu gasto médio por produto é: " + mediaValorProdutos);
        System.out.println(nome + ", seu salário anual líquido é de " + "R$" + salarioAnualLiquido + ", gaste como quiser!. Só não vá esquecer das contas!");



    }
}


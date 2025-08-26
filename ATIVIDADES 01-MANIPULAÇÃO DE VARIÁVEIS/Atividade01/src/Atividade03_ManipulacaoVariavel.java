import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;

public class Atividade03_ManipulacaoVariavel {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("R$#,##0.00");


        String nomeProd = "Carrinho de Brinquedo";
        double precoUnitario = 25.00;
        int quantProdComprados = 20;
        double taxaImpostoSobreProd = 1.20;
        double taxaImposto = 0.20;
        double margemLucro = 1.40;

        System.out.println("O valor total dos produtos é de: " + df.format(precoUnitario * quantProdComprados));
        System.out.println("O valor do imposto é de: " + df.format(taxaImposto * precoUnitario) + ", e o valor total do produto é: " + df.format(precoUnitario * taxaImpostoSobreProd));
        System.out.println("O valor necessário para alcançar o lucro seria de: " + df.format(precoUnitario * margemLucro));
        System.out.println("O nome do produto a venda é: " + nomeProd + ", o valor total com impostos é: " + df.format(precoUnitario * taxaImpostoSobreProd) + ", e o preço de venda sugerido é: " + (precoUnitario * margemLucro));
    }
}



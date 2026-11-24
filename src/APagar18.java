import java.util.Scanner;

public class APagar18 {

    public static void  main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total das vendas (R$): ");
        double valorTotalVendas = scanner.nextDouble();

        double salarioFixo = 5000.00;

        System.out.print("Digite o valor da comissão fixa por carro vendido (R$): ");
        double comissaoPorCarro = scanner.nextDouble();

        // Cálculos
        double totalComissaoCarros = carrosVendidos * comissaoPorCarro;
        double percentualVendas = valorTotalVendas * 0.05; // 5% sobre o total das vendas
        double salarioFinal = salarioFixo + totalComissaoCarros + percentualVendas;

        // Saída detalhada
        System.out.println("\n================ DETALHAMENTO DO SALÁRIO ================");
        System.out.printf("Salário Fixo Mensal:                  R$ %,.2f%n", salarioFixo);
        System.out.printf("Carros Vendidos:                      %d unidade(s)%n", carrosVendidos);
        System.out.printf("Comissão por Carro (R$ %.2f/un):     R$ %,.2f%n", comissaoPorCarro, totalComissaoCarros);
        System.out.printf("Valor Total das Vendas:               R$ %,.2f%n", valorTotalVendas);
        System.out.printf("Comissão de 5%% sobre Vendas:          R$ %,.2f%n", percentualVendas);
        System.out.println("---------------------------------------------------------");
        System.out.printf("SALÁRIO FINAL DO VENDEDOR:            R$ %,.2f%n", salarioFinal);
        System.out.println("=========================================================");

        scanner.close();

    }

}

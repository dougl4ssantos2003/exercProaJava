import java.util.Scanner;

public class CPFNaNota20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite a quantidade adquirida: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço unitário (R$): ");
        double precoUnitario = scanner.nextDouble();

        // Cálculo do valor bruto da venda
        double valorVenda = quantidade * precoUnitario;

        // Definição do percentual de desconto conforme a quantidade
        double percentualDesconto;
        if (quantidade <= 5) {
            percentualDesconto = 2.0;
        } else if (quantidade <= 10) {
            percentualDesconto = 3.0;
        } else {
            percentualDesconto = 5.0;
        }

        // Cálculo do desconto, imposto e total a pagar
        double valorDesconto = valorVenda * (percentualDesconto / 100.0);
        double valorImposto = valorVenda * 0.20; // 20% sobre o valor da venda
        double totalPagar = valorVenda - valorDesconto;

        // Exibição do recibo (Nota Fiscal)
        System.out.println("\n==========================================");
        System.out.println("              RECIBO / NOTA FISCAL        ");
        System.out.println("==========================================");
        System.out.printf("Produto:          %s%n", nomeProduto);
        System.out.printf("Quantidade:       %d un,.%n", quantidade);
        System.out.printf("Preço Unitário:   R$ %,.2f%n", precoUnitario);
        System.out.println("------------------------------------------");
        System.out.printf("Valor da Venda:   R$ %,.2f%n", valorVenda);
        System.out.printf("Desconto (%.0f%%):   - R$ %,.2f%n", percentualDesconto, valorDesconto);
        System.out.printf("Imposto (20%%):    R$ %,.2f (incluso/info)%n", valorImposto);
        System.out.println("------------------------------------------");
        System.out.printf("TOTAL A PAGAR:    R$ %,.2f%n", totalPagar);
        System.out.println("==========================================");

        scanner.close();

    }

}

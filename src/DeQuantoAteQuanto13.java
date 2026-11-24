import java.util.Scanner;

public class DeQuantoAteQuanto13 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o primeiro número (menor): ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número (maior): ");
        int num2 = scanner.nextInt();

        int soma = 0;
        int quantidade = 0;

        // Laço que percorre de num1 até num2 (incluindo os dois)
        for (int i = num1; i <= num2; i++) {
            soma += i;
            quantidade++;
        }

        // O (double) garante que a divisão não descarte as casas decimais
        double media = (double) soma / quantidade;

        // Saída do resultado
        System.out.println("A quantidade de números entre os dois é: " + quantidade);

        System.out.println("A soma desses números é: " + soma);

        System.out.println("A média aritmética é: " + media);

        scanner.close();

    }

}

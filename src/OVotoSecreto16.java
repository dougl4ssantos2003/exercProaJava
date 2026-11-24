import java.util.Scanner;

public class OVotoSecreto16 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o número total de eleitores do município: ");
        int totalEleitores = scanner.nextInt();

        System.out.print("Digite o percentual de votos brancos (%): ");
        double percBrancos = scanner.nextDouble();

        System.out.print("Digite o percentual de votos válidos (%): ");
        double percValidos = scanner.nextDouble();

        System.out.print("Digite o percentual de votos nulos (%): ");
        double percNulos = scanner.nextDouble();

        // Cálculo da quantidade de votos de cada categoria
        double votosBrancos = (totalEleitores * percBrancos) / 100.0;
        double votosValidos = (totalEleitores * percValidos) / 100.0;
        double votosNulos = (totalEleitores * percNulos) / 100.0;

        // Saída dos resultados
        System.out.println("\n--- Resultado da Apuração ---");
        System.out.printf("Votos brancos: %.0f votos%n", votosBrancos);
        System.out.printf("Votos válidos: %.0f votos%n", votosValidos);
        System.out.printf("Votos nulos: %.0f votos%n", votosNulos);

        scanner.close();

    }

}

import java.time.Year;
import java.util.Scanner;

public class DescansoMerecido21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtém o ano atual automaticamente do sistema (2026)
        int anoAtual = Year.now().getValue();

        // Entrada de dados
        System.out.print("Digite o número do empregado (código): ");
        int codigoEmpregado = scanner.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano de ingresso na empresa: ");
        int anoIngresso = scanner.nextInt();

        // Cálculos de idade e tempo de trabalho
        int idade = anoAtual - anoNascimento;
        int tempoTrabalho = anoAtual - anoIngresso;

        // Exibição dos dados calculados
        System.out.println("\n--- Dados do Empregado (Código: " + codigoEmpregado + ") ---");
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");

        // Verificação dos requisitos de aposentadoria
        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Status: Requerer aposentadoria");
        } else {
            System.out.println("Status: Não requerer");
        }

        scanner.close();
    }

}

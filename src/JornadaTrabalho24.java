import java.util.Scanner;

public class JornadaTrabalho24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o número total de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor do salário por hora (R$): ");
        double salarioHora = scanner.nextDouble();

        // Jornada mensal padrão: 40 horas/semana * 4 semanas = 160 horas
        double jornadaMensal = 40.0 * 4.0;
        double salarioTotal;

        if (horasTrabalhadas > jornadaMensal) {
            double horasExtras = horasTrabalhadas - jornadaMensal;
            double valorHoraExtra = salarioHora * 1.5; // Acréscimo de 50%

            salarioTotal = (jornadaMensal * salarioHora) + (horasExtras * valorHoraExtra);
        } else {
            salarioTotal = horasTrabalhadas * salarioHora;
        }

        // Saída do resultado
        System.out.printf("Salário total do funcionário: R$ %.2f%n", salarioTotal);

        scanner.close();
    }

}

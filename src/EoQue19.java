import java.util.Scanner;

public class EoQue19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada das medidas dos lados
        System.out.print("Digite a medida do lado A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite a medida do lado B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite a medida do lado C: ");
        double c = scanner.nextDouble();

        // Verifica se os valores são positivos e se cada lado é menor que a soma dos outros dois
        if (a > 0 && b > 0 && c > 0 && (a < b + c) && (b < a + c) && (c < a + b)) {
            System.out.println("Os valores informados FORMAM um triângulo.");
        } else {
            System.out.println("Os valores informados NÃO formam um triângulo.");
        }

        scanner.close();
    }

}

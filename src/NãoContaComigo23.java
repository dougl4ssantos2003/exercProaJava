public class NãoContaComigo23 {

    public static void main(String[] args) {
        // Laço externo: controla o número antes da vírgula (de 1 até 20)
        for (int i = 1; i <= 20; i++) {
            System.out.print("(" + i + ", ");

            // Laço interno: imprime sempre de 1 até 10 separados por espaço
            for (int j = 1; j <= 10; j++) {
                System.out.print(j);

                // Adiciona espaço apenas entre os números (não após o 10)
                if (j < 10) {
                    System.out.print(" ");
                }
            }

            System.out.println(")");

        }

    }

}

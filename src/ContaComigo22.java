public class ContaComigo22 {

    public static void main(String[] args) {
        int contador = 1;

        // Laço externo: controla o número da linha (de 1 até 20)
        for (int linha = 1; linha <= 20; linha++) {
            System.out.print("(" + linha + ", ");

            // Laço interno: imprime 10 números sequenciais por linha
            for (int j = 1; j <= 10; j++) {
                System.out.print(contador);

                // Adiciona vírgula e espaço apenas entre os números (não após o último)
                if (j < 10) {
                    System.out.print(", ");
                }

                contador++;
            }

            System.out.println(")");
        }

    }

}

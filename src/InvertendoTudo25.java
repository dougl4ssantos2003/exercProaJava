import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InvertendoTudo25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vetor = new String[12];

        // 1. Leitura dos 12 elementos
        System.out.println("Informe 12 elementos (números ou letras):");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextLine().trim();
        }

        // 2. Saída 1: Invertendo as posições diretamente no próprio vetor (primeiro <-> último)
        String[] vetorInvertido = vetor.clone();
        for (int i = 0; i < vetorInvertido.length / 2; i++) {
            String temp = vetorInvertido[i];
            int indiceOposto = vetorInvertido.length - 1 - i;
            vetorInvertido[i] = vetorInvertido[indiceOposto];
            vetorInvertido[indiceOposto] = temp;
        }

        System.out.print("\nSaída 1: ");
        System.out.println(String.join(", ", vetorInvertido));

        // 3. Saída 2: Separando por tipo a partir da ordem invertida (números e textos)
        List<String> numerosInvertidos = new ArrayList<>();
        List<String> letrasInvertidas = new ArrayList<>();

        for (String item : vetorInvertido) {
            if (ehNumero(item)) {
                numerosInvertidos.add(item);
            } else {
                letrasInvertidas.add(item);
            }
        }

        System.out.print("Saída 2: ");
        System.out.println(String.join(", ", numerosInvertidos) + " - " + String.join(", ", letrasInvertidas));

        scanner.close();
    }

    // Método auxiliar para verificar se a entrada digitada é um número
    private static boolean ehNumero(String texto) {
        if (texto == null || texto.isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(texto.replace(",", "."));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

}

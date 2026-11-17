import java.util.Arrays;
import java.util.Scanner;

public class QualOque7 {
    public static void main(String[] args){

        int[] numeros = new int[3];
        int soma;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o °"+(i+1)+" numero:");
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros);

        soma = numeros[1] + numeros[2];

        System.out.println("A soma dos dois maiores números é "+soma);

    }

}

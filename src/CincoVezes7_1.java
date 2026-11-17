import java.util.Arrays;
import java.util.Scanner;

public class CincoVezes7_1 {

    public static void main(String[] args){

        int[] numeros = new int[5];
        int soma;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o °"+(i+1)+" numero:");
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros);

        soma = numeros[3] + numeros[4];

        System.out.println("A soma dos dois maiores números é "+soma);

    }

}

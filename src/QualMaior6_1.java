import java.util.Scanner;

public class QualMaior6_1 {

    public static void main(String[] args){

        int[] numeros = new int[4];
        int maior = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o °"+(i+1)+" numero:");
            numeros[i] = sc.nextInt();
            if(numeros[i] > maior){
                maior = numeros[i];
            }
        }

        System.out.println("O maior numero é "+maior);

    }

}

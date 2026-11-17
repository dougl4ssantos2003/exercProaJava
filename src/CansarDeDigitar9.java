import java.util.Scanner;

public class CansarDeDigitar9 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double[] medias = new double[10];
        double soma = 0, result = 0;

        for(int i = 0; i < medias.length; i++){
            System.out.println("Digite o "+(i+1)+"° número:");
            medias[i] = sc.nextDouble();
        }

        for(int i = 0; i < medias.length; i++){
            System.out.println("O "+(i+1)+"° número é "+medias[i]);
            soma += medias[i];
        }

        result = soma / medias.length;
        System.out.println("A média dos 10 números é "+result);

    }
}

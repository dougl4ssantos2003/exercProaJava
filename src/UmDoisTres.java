import java.util.Scanner;

public class UmDoisTres {

    public static void main(String[] args){

        String indice;
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        n = sc.nextInt();

        if(n < 0){
            indice = "Negativo.";
        } else if (n > 0) {
            indice = "Positivo.";
        }else {
            indice = "0 | Neutro.";
        }

        System.out.println("Esse número é "+indice);

    }

}

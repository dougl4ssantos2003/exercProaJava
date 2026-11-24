import java.util.Scanner;

public class Parabens10 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];
        double media = 0, result = 0;
        String msg;

        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a "+(i+1)+"° nota do aluno:");
            notas[i] = sc.nextDouble();
            media += notas[i];
        }

        result = media / notas.length;

        if( result >= 6){
            msg = "Aprovado, Parabéns";
        }else {
            msg = "Reprovado, estude mais!";
        }

        System.out.println("A sua média é "+result+".\nVocê foi "+msg);

    }

}

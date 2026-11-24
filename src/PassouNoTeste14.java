import java.util.Locale;
import java.util.Scanner;

public class PassouNoTeste14 {

    public static void main (String[] args){


        boolean continua = true;

        while(continua) {

        Scanner sc = new Scanner(System.in);
        double[] notas = new double[6];
        double media = 0, result = 0;
        String msg, resp;

            for (int i = 0; i < notas.length; i++) {
                System.out.println("Digite a " + (i + 1) + "° nota do aluno:");
                notas[i] = sc.nextDouble();
                media += notas[i];
            }

            result = media / notas.length;

            if (result >= 6.5) {
                msg = "Aprovado, Parabéns";
            } else {
                msg = "Reprovado, estude mais!";
            }

            System.out.println("A média do aluno é " + String.format("%.2f", result)+ ".\nEle foi " + msg);

            System.out.println("Calcular a média de outro aluno Sim/Não?");
            resp = sc.next();

            if(resp.equalsIgnoreCase("Não") || resp.equalsIgnoreCase("Nao".trim())){
                continua = false;
            }else if(resp.equalsIgnoreCase("sim".trim())) {
                continua = true;
            }else{
                System.out.println("Opção Invalida, programa encerrado!");
                continua = false;
            }

        }

    }

}

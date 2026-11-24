import java.util.Scanner;

public class CustaQuanto17 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double custoFabrica, custoFinal, distrbuidor , imposto;

        System.out.println("Digite o custo de fabrica do carro:");
        custoFabrica = sc.nextDouble();

        distrbuidor = custoFabrica * 0.28;

        imposto =  custoFabrica * 0.45;

        custoFinal = custoFabrica + distrbuidor + imposto;

        System.out.println("========== Custos do Veiculo ==========");
        System.out.println("Custo Fabrica: "+String.format("%,.2f", custoFabrica));
        System.out.println("Custo Distribuidor: "+String.format("%,.2f", distrbuidor));
        System.out.println("Custo Imposto: "+String.format("%,.2f", imposto));
        System.out.println("Custo total: "+String.format("%,.2f", custoFinal));

    }

}

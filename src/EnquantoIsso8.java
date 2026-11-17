import java.util.Scanner;

public class EnquantoIsso8 {

    public static void main(String[] args){

        double v1, v2 , div;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o °1 número:");
        v1 = sc.nextDouble();

        while (true){
          System.out.println("Digite o °2 número:");
          v2 = sc.nextDouble();
          if(v2 <= 0){
            System.out.println("Digite um número maior que 0!");
          }else {
              break;
          }

        }
        div = v1 / v2;
        System.out.println("A divisão do 1° número pelo 2° número é "+div);

    }

}

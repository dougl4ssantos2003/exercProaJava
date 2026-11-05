import java.util.Scanner;

public class ABitofInformation {

    public static void main(String[] args){
        String nome;
        int idade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        nome = sc.nextLine();
        System.out.println("Digite a sua idade");
        idade = sc.nextInt();

        System.out.println("Olá, "+nome+", sua idade é "+idade);
    }

}

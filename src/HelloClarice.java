import java.util.Scanner;

public class HelloClarice {

    public static void main (String[] args){
        String nome;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();

        System.out.println("Olá, "+nome);

    }
}

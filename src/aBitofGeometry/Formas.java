package aBitofGeometry;

import java.util.Scanner;

public class Formas {

    Scanner sc = new Scanner(System.in);

    double b, alt, bMaior, bMenor, dMaior, dMenor, lado;

    double total;

    public void calcularTriangulo(){

        System.out.println("Digite a base do Triângulo:");
        b = sc.nextDouble();

        System.out.println("Digite a altura do Triângulo:");
        alt = sc.nextDouble();

        total = (b * alt) / 2;
        System.out.println("A area do Triângulo é "+total);

    }

    public void calcularQuadrado(){

        System.out.println("Digite o lado do Quadrado:");
        lado = sc.nextDouble();

        total = Math.pow(lado, 2);
        System.out.println("A area do Quadrado é "+total);

    }

    public void calcularRetangulo(){

        System.out.println("Digite a base do Retângulo:");
        b = sc.nextDouble();

        System.out.println("Digite a altura do Retângulo:");
        alt = sc.nextDouble();

        total = (b * alt);
        System.out.println("A area do Retângulo é "+total);

    }

    public void calcularTrapezio(){

        System.out.println("Digite a diagonal Maior do Trapézio:");
        bMaior = sc.nextDouble();

        System.out.println("Digite a diagonal Menor do Trapézio:");
        bMenor = sc.nextDouble();

        System.out.println("Digite a altura do Trapézio:");
        alt = sc.nextDouble();

        total = (bMaior * bMenor) * alt / 2;
        System.out.println("A area do Trapézio é "+total);

    }

    public void calcularLosango(){

        System.out.println("Digite a diagonal Maior do Losango:");
        dMaior = sc.nextDouble();

        System.out.println("Digite a diagonal Menor do Losango:");
        dMenor = sc.nextDouble();

        total = (dMaior * dMenor) / 2;
        System.out.println("A area do Losango é"+total);

    }

    public void calcularParalelogramo(){

        System.out.println("Digite a base do Paralelogramo:");
        b = sc.nextDouble();

        System.out.println("Digite a altura do Paralelogramo:");
        alt = sc.nextDouble();

        total = b * alt;
        System.out.println("A area do Paralelogramo é "+total);

    }

    public void calcularCirculo(){

        System.out.println("Digite o valor o raio do Circulo:");
        double raio = sc.nextDouble();

        total = Math.PI * Math.pow(raio, 2);
        System.out.println("A area do Circulo é "+total);

    }

}

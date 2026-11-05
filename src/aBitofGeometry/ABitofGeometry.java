package aBitofGeometry;

import java.util.Scanner;

public class ABitofGeometry {

    public static void main(String[] args){

    int escolha;
    Formas f = new Formas();
    Scanner sc = new Scanner(System.in);

    System.out.println("Qual a forma Geometrica você quer calcular digite o número correspondente:\n" +
            "1-Retângulo | 2-Quadrado | 3-Losango | 4-Trapézio | 5-Paralelogramo | 6-Triângulo | 7-Circulo: ");
    escolha = sc.nextInt();

    switch(escolha) {
        case 1:
            f.calcularRetangulo();
            break;
        case 2:
            f.calcularQuadrado();
            break;
        case 3:
            f.calcularLosango();
            break;
        case 4:
            f.calcularTrapezio();
            break;
        case 5:
            f.calcularParalelogramo();
            break;
        case 6:
            f.calcularTriangulo();
            break;
        case 7:
            f.calcularCirculo();
            break;
        default:
            System.out.println("Digite um numero valido!");

    }
    }

}

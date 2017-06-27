package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("PRIMER PUNTO");
        System.out.println("Coordenada x:");
        double x = sc.nextDouble();
        System.out.println("Coordenada y:");
        double y = sc.nextDouble();
        Punto punto1 = new Punto(x, y);
        System.out.println("Desplazar x:");
        double dx = sc.nextDouble();
        punto1.desplaza(dx);
        System.out.println("Desplazar x & y:");
        double dy = sc.nextDouble();
        punto1.desplaza(dx, dy);
        System.out.println("NUEVO PUNTO");
        System.out.println("Coordenada x:");
        double x2 = sc.nextDouble();
        System.out.println("Coordenada y:");
        double y2 = sc.nextDouble();
        Punto otro = new Punto(x2, y2);
        System.out.println("La distancia entre puntos es " + punto1.distanciaEuclidea(otro));
        punto1.muestra();

    }
}

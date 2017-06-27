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
/*
        punto1.muestra();
        System.out.println("Vamos a crear un rectangulo \nDame los puntos(x,y):");


        System.out.println("Punto 1 X:");
            int x1 = sc.nextInt();
        System.out.println("Punto 1 Y:");
            int y1 = sc.nextInt();
        Punto p1 = new Punto(x1, y1);

        System.out.println("Punto 2 X:");
            int x2 = sc.nextInt();
        System.out.println("Punto 2 Y:");
            int y2 = sc.nextInt();
        Punto p2 = new Punto(x2, y2);

        System.out.println("Punto 3 X:");
            int x3 = sc.nextInt();
        System.out.println("Punto 3 Y:");
            int y3 = sc.nextInt();
        Punto p3 = new Punto(x3, y3);

        System.out.println("Punto 4 X:");
            int x4 = sc.nextInt();
        System.out.println("Punto 4 X:");
            int y4 = sc.nextInt();
        Punto p4 = new Punto(x4, y4);

        Rectangulo rectangulo1 = new Rectangulo(p1, p2, p3, p4);

        System.out.println("Vamos a hacer un segundo rectangulo para comprobar si se superponen ");

        System.out.println("Punto 1 X:");
            int x5 = sc.nextInt();
        System.out.println("Punto 1 Y:");
            int y5 = sc.nextInt();
        Punto p5 = new Punto(x5, y5);

        System.out.println("Punto 1 X:");
            int x6 = sc.nextInt();
        System.out.println("Punto 1 Y:");
            int y6 = sc.nextInt();
        Punto p6 = new Punto(x6, y6);

        System.out.println("Punto 1 X:");
            int x7= sc.nextInt();
        System.out.println("Punto 1 Y:");
            int y7= sc.nextInt();
        Punto p7 = new Punto(x7, y7);

        System.out.println("Punto 1 X:");
            int x8 = sc.nextInt();
        System.out.println("Punto 1 Y:");
            int y8 = sc.nextInt();
        Punto p8 = new Punto(x8, y8);

        Rectangulo rectangulo2 =new Rectangulo(p5, p6, p7, p8);

        if (rectangulo1.solapamiento(rectangulo2)){
            System.out.println("Estan superpuestos");
        }else{
            System.out.println("Ni se tocan co, perfecto");
        }

        System.out.println(rectangulo1);
        System.out.println(rectangulo2);

    }
*/
    }
}

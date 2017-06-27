package com.company;

/**
 * Created by e-imb on 27/06/2017.
 */
public class Punto {
    private double x;
    private double y;

    public Punto (double x, double y){
        this.x=x;
        this.y=y;
    }

    public  void desplaza(double dx){
        x += dx;
    }

    public  void desplaza(double dx, double dy){
        x += dx;
        y += dy;
    }
    public double distanciaEuclidea(Punto otro){
        double d = Math.sqrt( Math.pow(otro.x-x, 2) + Math.pow(otro.y-y, 2) );
        return d;
    }
    public void muestra(){
        System.out.println("Coordenada x = "+x+"\nCoordenada y = "+y);
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

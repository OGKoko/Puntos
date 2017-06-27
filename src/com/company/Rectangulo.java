package com.company;

/**
 * Created by e-imb on 27/06/2017.
 */
public class Rectangulo {
    private Punto p1;
    private Punto p2;
    private Punto p3;
    private Punto p4;

    public Rectangulo (Punto p1, Punto p2, Punto p3, Punto p4){

        if (checkRectangulo(p1, p2, p3, p4)){
            this.p1=p1;
            this.p2=p2;
            this.p3=p3;
            this.p4=p4;
        }
        else {
            System.out.println("ERROR!");
        }
    }

    public boolean checkRectangulo(Punto p1, Punto p2, Punto p3, Punto p4){

        if (p1.getY()==p2.getY() &&
                p3.getY()==p4.getY() &&
                p1.getX()==p4.getX() &&
                p2.getX()==p3.getX() ){

            return true;
        }
        return false;
    }

    public boolean solapamiento (Rectangulo otro){

        if (pointIsInside(otro.getP1()) ||
                pointIsInside(otro.getP2()) ||
                pointIsInside(otro.getP3()) ||
                pointIsInside(otro.getP4())){
            return true;
        }else {
            return false;
        }

    }

    public boolean pointIsInside(Punto p){

        if ((p.getY() < p1.getY()  &&
                p.getY() > p4.getX()  &&
                p.getX() > p4.getX()  &&
                p.getX() < p3.getX())
                ){
            return true;
        }
        else{
            return false;}

    }

    public Punto getP1() {
        return p1;
    }

    public Punto getP2() {
        return p2;
    }

    public Punto getP3() {
        return p3;
    }

    public Punto getP4() {
        return p4;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    public void setP3(Punto p3) {
        this.p3 = p3;
    }

    public void setP4(Punto p4) {
        this.p4 = p4;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                ", p4=" + p4 +
                '}';
    }
}


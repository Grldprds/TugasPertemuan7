/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas7;

import java.util.Scanner;


class LinearEquation {
    private double a, b, c, d, e, f;

    public LinearEquation() {
        //tanpa argumen
    }

     public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setE(double e) {
        this.e = e;
    }

    public void setF(double f) {
        this.f = f;
    }

    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}


public class tugas7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nilai a, b, c, d, e, dan f:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        LinearEquation equation = new LinearEquation();
        // Set nilai a, b, c, d, e, dan f 
        equation.setA(a);
        equation.setB(b);
        equation.setC(c);
        equation.setD(d);
        equation.setE(e);
        equation.setF(f);

        if (equation.isSolvable()) {
            System.out.println("Solusi untuk x adalah: " + equation.getX());
            System.out.println("Solusi untuk y adalah: " + equation.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi.");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan8_9;

public class Segitiga extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    
    public Segitiga() {
        this(1.0, 1.0, 1.0);
    }

   
    public Segitiga(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

 
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

  
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

   
    @Override
    public String toString() {
        return "Segitiga: sisi1 = " + side1 + " sisi2 = " + side2 + " sisi3 = " + side3;
    }
}

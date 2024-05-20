/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Lenovo
 */
public class Segitiga extends objekGeometris {
    protected float side1;
    protected float side2;
    protected float side3;

    public Segitiga() {
    }

    public Segitiga(float side1, float side2, float side3, String warna, boolean terisi) {
        super(warna, terisi);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // getArea() mengembalikan luas segitiga
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // getPerimeter() yang mengembalikan perimeter segitiga
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // toString() yang mengembalikan deskripsi segitiga
    public void toStrings() {
        System.out.println("Segitiga dengan sisi1 = " + side1 + ", sisi2 = " + side2 + ", dan sisi3 = " + side3);
    }
}

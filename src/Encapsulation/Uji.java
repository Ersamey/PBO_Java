package Encapsulation;

import java.util.Scanner;

public class Uji {

    public static void main(String[] args) {
        LinearEquation myObj = new LinearEquation();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai a: ");
        myObj.setA(input.nextFloat());
        System.out.print("Masukkan nilai b: ");
        myObj.setB(input.nextFloat());
        System.out.print("Masukkan nilai c: ");
        myObj.setC(input.nextFloat());
        System.out.print("Masukkan nilai d: ");
        myObj.setD(input.nextFloat());
        System.out.print("Masukkan nilai e: ");
        myObj.setE(input.nextFloat());
        System.out.print("Masukkan nilai f: ");
        myObj.setF(input.nextFloat());

        System.out.println("a = " + myObj.getA());
        System.out.println("b = " + myObj.getB());
        System.out.println("c = " + myObj.getC());
        System.out.println("d = " + myObj.getD());
        System.out.println("e = " + myObj.getE());
        System.out.println("f = " + myObj.getF());
        if (myObj.isSolvable()) {
            System.out.println("x = " + myObj.getX());
            System.out.println("y = " + myObj.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi.");
        }
    }
}

package BangunDatar;
import java.util.Scanner;

public class Segitiga {
    static float luas(float alas, float tinggi){
        return alas*tinggi/2;
    }
    
    static float keliling(float a, float b, float c){
        return a+b+c;
    }
    
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Program menghitung keliling segitiga");
        System.out.println("masukan panjang sisi alas, tinggi dan miring segitiga: ");
        float a = myObj.nextFloat();
        float b = myObj.nextFloat();
        float c = myObj.nextFloat();
        System.out.println("Keliling segitiga adalah: "+ keliling(a,b,c));

        System.out.println("Program menghitung Luas segitiga");
        System.out.println("Masukan Alas segitiga");
        float alas = myObj.nextFloat();
        System.out.println("Masukan Tinggi segitiga");
        float tinggi = myObj.nextFloat();        
        System.out.println("Luas segitiga adalah: "+ luas(alas, tinggi));

    }
}

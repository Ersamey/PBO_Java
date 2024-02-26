
package belajarjava;
import java.util.Scanner;
public class Satu {
    public static void main(String[] arge){
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Masukan angka x: ");
        float x = myObj.nextFloat();
        System.out.println("Masukan angka y: ");
        float y = myObj.nextFloat();
        System.out.println("Masukan angka z: ");
        float z = myObj.nextFloat();
        
        float tambah = x + y + z;
        float kurang = x - y - z;
        float kali = x * y * z;
        float bagi = x / y / z;
        
        System.out.println("Hasil " + x + " + " + y + " + " + z + " = " + tambah);
        System.out.println("Hasil " + x + " - " + y + " - " + z + " = " + kurang);
        System.out.println("Hasil " + x + " * " + y + " * " + z + " = " + kali);
    }
}

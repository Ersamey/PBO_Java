package Percabangan;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        
        System.out.println("Masukkan angka: ");
        int angka = myobj.nextInt();
        
        if (angka >= 1000 && angka <= 9999) {
            System.out.println(angka + " adalah ribuan");
        } else if (angka >= 10000 && angka <= 99999){
            System.out.println(angka + " adalah puluhan ribuan");
        } else if (angka >= 100000 && angka <= 999999) {
            System.out.println(angka + " adalah ratusan ribuan");
        } else {
            System.out.println(angka + " bukan ribuan");       
        }
    }
}

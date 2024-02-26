package Percabangan;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        
        System.out.println("Jam Masuk: ");
        int masuk = myobj.nextInt();
        
        System.out.println("Jam Keluar: ");
        int keluar = myobj.nextInt();
        if (masuk > keluar ){
            keluar += 12;
        }
        int lama = keluar - masuk;
        int tarif = 0;
        if (lama <= 2) {
           tarif = 1500;
        } else{
             tarif = 1500 + (lama - 2) * 1000;
        }
        System.out.println(tarif);
    }
}

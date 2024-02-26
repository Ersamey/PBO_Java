package Percabangan;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        
        System.out.println("Masukkan angka pertama: ");
        int satu = myobj.nextInt();
        System.out.println("Masukkan angka Kedua: ");
        int dua = myobj.nextInt();
        System.out.println("Masukkan angka Ketiga: ");
        int tiga = myobj.nextInt();
        
        if (satu >= dua && satu >= tiga) {
            System.out.println("Angka terbesar adalah " + satu);
        } else if (dua >= satu && dua >= tiga){
            System.out.println("Angka terbesar adalah " + dua);
        } else if (tiga >= dua && tiga >= satu) {
            System.out.println("Angka terbesar adalah " + tiga);
        }
    }
}

package Inheritance;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        // meminta pengguna memasukkan tiga sisi segitiga,
        System.out.println("Masukkan sisi1: ");
        float sisi1 = myobj.nextFloat();
        System.out.println("Masukkan sisi2: ");
        float sisi2 = myobj.nextFloat();
        System.out.println("Masukkan sisi3: ");
        float sisi3 = myobj.nextFloat();
        // warna, dan apakah segitiga tersebut terisi
        System.out.println("Masukkan warna: ");
        String warna = myobj.next();
        System.out.println("Apakah terisi? (true/false): ");
        boolean terisi = myobj.nextBoolean();
        // membuat objek Segitig adiisi menggunakan data dari input.
        Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3, warna, terisi);
        // menampilkan luas, keliling, warna, dan benar atau salah untuk menunjukkan
        // apakah diisi atau tidak.
        segitiga.toStrings();
        System.out.println("Luas segitiga: " + segitiga.getArea());
        System.out.println("Keliling segitiga: " + segitiga.getPerimeter());
        System.out.println("Segitiga terisi: " + segitiga.isTerisi());
        System.out.println("Segitiga berwarna : " + segitiga.getWarna());

    }
}

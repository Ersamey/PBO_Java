
package belajarjava;

public class Tiga {

    public static void main(String[] args) {
        
        // Mendefinisikan karakter 'A' dan 'B'
        char charA = 'A';
        char charB = 'B';

        // Menghitung kode ASCII untuk karakter 'A' dan 'B'
        int asciiA = (int) charA;
        int asciiB = (int) charB;

        // Menjumlahkan kode ASCII
        int totalAscii = asciiA + asciiB;

        // Menampilkan hasil
        System.out.println("Kode ASCII untuk karakter 'A': " + asciiA);
        System.out.println("Kode ASCII untuk karakter 'B': " + asciiB);
        System.out.println("Total jumlah kode ASCII 'A' dan 'B': " + totalAscii);
    }
}

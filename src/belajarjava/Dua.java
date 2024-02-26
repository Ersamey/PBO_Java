
package belajarjava;
import java.util.Scanner;
public class Dua {
    public static void main(String[] arge){
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Kamu ranking berapa di kelas? ");
        int ranking = myObj.nextInt();
        myObj.nextLine();
        System.out.println("Apakah kamu naik kelas? (ya/tidak) ");
        String kelas = myObj.nextLine();
        boolean naikKelas = kelas.equals("ya");
        
        if(ranking == 1 && naikKelas){
            System.out.println("SELAMAT KAMU DAPAT HADIAH!!");
        }else{
            System.out.println("SEMANGAT BELAJAR YANG RAJIN YA!!");
        }
    }
}

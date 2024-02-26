package Perulangan;
import java.util.Scanner;
public class No2 {
    public static void main(String[] args){    
        Scanner myObj = new Scanner(System.in);
        System.out.println("Masukan batas awal: ");
        int awal = myObj.nextInt();
        System.out.println("Masukan batas akhir: ");
        int akhir = myObj.nextInt();
        
        for(int i=awal; i<akhir; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}

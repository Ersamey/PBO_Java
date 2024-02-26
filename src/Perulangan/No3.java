package Perulangan;
import java.util.Scanner;

public class No3 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        
        int bilangan1 = myObj.nextInt();
        int bilangan2 = myObj.nextInt();
        
        int terbesar;
        if (bilangan1 > bilangan2){
            terbesar = bilangan1;
        }else{
            terbesar = bilangan2;
        }
        int temp = 0;
        for(int i=2; i<terbesar; i++){
            if((bilangan1 % i == 0) && (bilangan2 % i == 0)){
                temp = i;
            }
        }
        
        System.out.println("Pembagi Bersama Terbesar dari " + bilangan1 + " dan "+bilangan2+" adalah = "+temp);
    }
}

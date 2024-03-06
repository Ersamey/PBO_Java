package Method;
import java.util.Scanner;

public class PBT {
    static int pembagiBersamaTerbesar(int a, int b){
        int terbesar;
        if (a > b){
            terbesar = a;
        }else{
            terbesar = b;
        }
        int temp = 0;
        for(int i=1; i<=terbesar; i++){
            if((a % i == 0) && (b % i == 0)){
                temp = i;
            }
        }
        return temp;
    }
    
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Program menentukan Pembagi Bersama Terbesar");
        System.out.println("Masukan bilangan a: ");
        int a = myObj.nextInt();
        System.out.println("Masukan bilangan b: ");
        int b = myObj.nextInt();
        
        int hasil = pembagiBersamaTerbesar(a,b);
        
        System.out.println("Pembagi Bersama Terbesar dari "+a+" dan "+b+" adalah "+hasil);
    }
}

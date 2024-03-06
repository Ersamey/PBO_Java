package Method;
import java.util.Scanner;
public class satu {
    static void java(int n){
        for(int i=0; i<n; i++){
            System.out.println("Saya senang belajar bahasa Java");
        }
    }
    
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Masukan banyak perulangan : ");
        int banyak = myObj.nextInt();
        java(banyak);
    }
}


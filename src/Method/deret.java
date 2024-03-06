package Method;
import java.util.Scanner;

public class deret {
    static void deret(int awal, int akhir){
        for(int i=awal; i<=akhir; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Masukan batas awal : ");
        int batasAwal = myObj.nextInt();
        System.out.println("Masukan batas akhir : ");
        int batasAkhir = myObj.nextInt();
        
        deret(batasAwal, batasAkhir);
    }
}

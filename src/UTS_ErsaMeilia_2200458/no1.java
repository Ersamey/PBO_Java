package UTS_ErsaMeilia_2200458;
import java.util.Scanner;
public class no1 {

    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan tiga digit integer : ");
        a = input.nextInt();
        if(a < 100 || a > 999){
            System.out.println("Inputan anda salah");
        }else{
            if( a / 100 == a % 10){
                System.out.println("Angka " + a + " adalah palindrom");
            }else{
                System.out.println("Angka " + a + " bukan palindrom");
           }
        }
    }
}

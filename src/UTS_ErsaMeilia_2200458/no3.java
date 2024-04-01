package UTS_ErsaMeilia_2200458;
import java.util.Scanner;
public class no3 {
    public static int reverse(int angka){
      int reversed = 0;
      while(angka != 0){
        int digit = angka % 10;
        System.out.println("digit: " + digit);
        reversed = reversed * 10 + digit;
        System.out.println("reversed: " + reversed);
        angka /= 10;
        System.out.println("angka: " + angka);
        System.out.println("==============");
      }
      return reversed;
    }

  public static boolean isPalindrome(int angka){
    if(angka == reverse(angka)){
      return true;
    }else{
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan angka: ");
    int angka = input.nextInt();
    if(isPalindrome(angka)){
      System.out.println(angka + " adalah palindrome");
    }else{
      System.out.println(angka + " bukan palindrome");
    }
  }
}

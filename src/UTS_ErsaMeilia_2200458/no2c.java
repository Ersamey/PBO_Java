package UTS_ErsaMeilia_2200458;

public class no2c {
  public static void main(String[] args) {
    //patern C
    int i, j;
    for(i=0; i<6; i++){
      for(j=0; j<6-(i+1); j++){
        System.out.print(" ");
      }
      for(j=i; j>=0; j--){
        System.out.print(j+1);
      }
      System.out.println();
    }
  }
}
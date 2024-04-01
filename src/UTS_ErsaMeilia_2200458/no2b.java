package UTS_ErsaMeilia_2200458;

public class no2b {
  public static void main(String[] args) {
    //patern B
    int i, j;
    for(i=0; i<6; i++){
      for(j=0; j<6-i; j++){
        System.out.print(j+1);
      }
      System.out.println();
    }
  }
}
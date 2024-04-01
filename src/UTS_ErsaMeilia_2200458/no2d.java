package UTS_ErsaMeilia_2200458;

public class no2d {
     public static void main(String[] args) {
    //patern D
    int i, j;
    for(i=0; i<6; i++){
        for(j=0; j<i; j++){
           System.out.print(" ");
        }
        for(j=0; j<6-i; j++){
            System.out.print(j+1);
        }
        System.out.println();
        }
    }
}

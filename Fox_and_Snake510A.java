import java.lang.*;
import java.util.*;

public class Fox_and_Snake510A {
   public static void main(String arg[]){
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       String[][] ar = new String[n][m];
       for(int i=0; i<n; i=i+2){
           for(int j=0; j<m; j++){
               ar[i][j] = "#";
           }
       }
       for(int i=1;i<n; i=i+4){
           for(int j=0;j<m-1;j++){
               ar[i][j] = ".";

           }
           ar[i][m-1] = "#";
       }
       for(int i=3; i<n; i=i+4) {
           for (int j = 1; j < m; j++) {
               ar[i][j] = ".";
           }
           ar[i][0] = "#";
       }
       for(int i=0;i<n;i++){
           for(int j=0; j<m; j++){
               System.out.print(ar[i][j]);
           }
           System.out.println();
       }


   }
}

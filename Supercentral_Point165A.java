import java.util.*;

public class Supercentral_Point165A {
  public static void main(String arg[]){
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int[] x = new int[n];
      int[] y = new int[n];
      for(int i=0; i<n; i++){
          x[i] = sc.nextInt();
          y[i] = sc.nextInt();
      }
      int count=0;
      for(int i=0; i<n; i++){
          int right=0,left=0,up=0,down=0;
          for(int j=i-1; j>=0; j--){
              if(x[j]>x[i] && y[j]==y[i]){
                  right++;
              }
              if(x[j]<x[i] && y[j]==y[i]){
                  left++;
              }
              if(x[j]==x[i] && y[j]>y[i]){
                  up++;
              }
              if(x[j]==x[i] && y[j]<y[i]){
                  down++;
              }
          }
          for(int j=i+1; j<n; j++){
              if(x[j]>x[i] && y[j]==y[i]){
                  right++;
              }
              if(x[j]<x[i] && y[j]==y[i]){
                  left++;
              }
              if(x[j]==x[i] && y[j]>y[i]){
                  up++;
              }
              if(x[j]==x[i] && y[j]<y[i]){
                  down++;
              }
          }
          if(right>=1 && left>=1 && up>=1 && down>=1){
              count++;
          }
      }
      System.out.println(count);
  }

}

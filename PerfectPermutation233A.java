import java.util.*;
import java.lang.*;

public class PerfectPermutation233A {
  public static void main(String arg[]){
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int count1=0,count2=0;
      int[] odd = new int[n/2];
      int[] even = new int[n/2];
      if(n%2!=0)
          System.out.println(-1);
      else {
          for (int i = 1; i <= n; i++) {
              if (i % 2 == 0) {
                  even[count1] = i;
                  count1++;
              }
              else {
                  odd[count2] = i;
                  count2++;
              }

          }
          for (int i = 0; i < n / 2; i++) {
              System.out.print(even[i]);
              System.out.print(" ");
              System.out.print(odd[i]);
              System.out.print(" ");
          }
      }

          }
      }




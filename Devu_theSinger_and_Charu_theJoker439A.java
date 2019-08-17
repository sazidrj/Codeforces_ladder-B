import java.lang.*;
import java.util.*;

public class Devu_theSinger_and_Charu_theJoker439A {
  public static void main(String arg[]){
      Scanner sc = new Scanner(System.in);
      ArrayList<Integer> songPeriods = new ArrayList<>();
      int n = sc.nextInt();
      int d = sc.nextInt();
      int sum = 0,p=0;
      for(int i=0;i<n;i++){
          songPeriods.add(sc.nextInt());
      }
      if(d>=songPeriods.get(0)) {
          d = d - songPeriods.get(0);
          p = p + 1;
      }
      for(int i=1; i<n; i++){
                  if(d>=10) {
                      d = d - 10;
                      sum=sum+2;

                      if (d >= songPeriods.get(i)) {
                          d = d - songPeriods.get(i);
                          p++;
                      }
                  }
      }
      if(p==n)
          System.out.println(sum + d/5);
      else
          System.out.println(-1);



  }
}

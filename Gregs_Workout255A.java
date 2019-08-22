import java.util.*;
import java.lang.*;
public class Gregs_Workout255A {
  public static void main(String arg[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int i,count1=0, count2=0, count3=0;
      for( i=1; i<=n; i++){
          int m = sc.nextInt();
          if(i%3==1)
              count1 = count1 + m;
          else if(i%3==2)
              count2 = count2 + m;
          else
              count3 = count3 + m;
      }
      if(count1>count2 && count1>count3)
          System.out.println("chest");
      else if(count2>count1 && count2>count3)
          System.out.println("biceps");
      else
          System.out.println("back");





  }

}

import java.lang.*;
import java.util.*;
public class IQ_test25A {
  public static void main(String arg[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int countEven=0, countOdd=0, indexEven=0, indexOdd=0;
      for(int i=0; i<n; i++){
          if(sc.nextInt()%2==0){
              countEven = countEven+1;
              indexEven = i+1;
          }
          else{
              countOdd = countOdd+1;
              indexOdd = i+1;
          }
      }
      if(countEven>countOdd)
          System.out.println(indexOdd);
      else
          System.out.println(indexEven);
  }

}

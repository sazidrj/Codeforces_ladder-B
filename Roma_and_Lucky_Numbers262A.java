import java.util.*;
public class Roma_and_Lucky_Numbers262A {
  public static void main(String arg[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int sum=0;
      for(int i=0; i<n; i++){
          int a = sc.nextInt();
          int count=0;
          for(int j=0; j<Integer.toString(a).length(); j++){
              if(Integer.toString(a).charAt(j)=='4' || Integer.toString(a).charAt(j)=='7'){
                  count++;
              }
          }
          if(count<=k){
              sum++;
          }
      }
          System.out.println(sum);
  }
}

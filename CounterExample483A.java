import java.util.*;
import java.lang.*;

public class CounterExample483A {
   public static void main(String arg[]){
       Scanner sc = new Scanner(System.in);
       long l = sc.nextLong();
       long r = sc.nextLong();
       if(l+2>r)
           System.out.println(-1);
       else{
           for(long i=l; i<=r-2; i++){
               for (long j=l+1 ; j<=r-1; j++){
                   for(long k=l+2; k<=r; k++){
                       if(findGCD(i,j)==1 && findGCD(j,k)==1 && findGCD(i,k)!=1){
                           System.out.println(i+" "+j+" "+k);
                           return;
                       }
                   }
               }
           }
           System.out.println(-1);
       }


   }
 private static long findGCD(long a, long b){
       if(b==0) {
           return a;
       }
       return findGCD(b, a%b);
 }

}

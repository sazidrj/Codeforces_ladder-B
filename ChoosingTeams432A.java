import java.lang.*;
import java.util.*;

public class ChoosingTeams432A {
   public static void main(String arg[]){
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int k = sc.nextInt();
       int no_of_team=0,count=0;
       for(int i=0; i<n; i++){
           if(5-sc.nextInt()>=k){
               count=count+1;
               if(count%3==0)
                   no_of_team++;

           }
       }
       System.out.println(no_of_team);
   }


}

import java.util.*;
import java.lang.*;
import java.io.*;
public class Playing_with_Dice378A {
   public static void main(String arg[]) throws IOException{
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String[] s1 = reader.readLine().trim().split(" ");
       int a = Integer.parseInt(s1[0]);
       int b = Integer.parseInt(s1[1]);
       int counter1=0, counter2=0,counter3=0;
       for(int i=1; i<=6; i++){
           if(Math.abs(a-i)<Math.abs(b-i))
               counter1++;
           else if(Math.abs(b-i)==Math.abs(a-i))
               counter2++;
           else
               counter3++;
       }
       System.out.println(counter1+ " "+ counter2+ " "+ counter3);

   }

}

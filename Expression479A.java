import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Expression479A {
   public static void main(String arg[]){
       try {
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           int a = Integer.parseInt(reader.readLine());
           int b = Integer.parseInt(reader.readLine());
           int c = Integer.parseInt(reader.readLine());
           int max = a*b*c;
           if(max<((a*b)+c))
               max = ((a*b)+c);
           if(max<(a+(b*c)))
               max = (a+(b*c));
           if(max<(a+b+c))
               max = a+b+c;
           if(max<(a+b)*c)
               max = (a+b)*c;
           if(max<a*(b+c))
               max = a*(b+c);
           System.out.println(max);


       }
       catch(IOException e){
           System.out.println(e.getMessage());
       }
   }
}

import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class dubstep {
   public static void main(String arg[]){
       try {
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           int i = 0;
           String s = reader.readLine();
           while(i < s.length()){
               if (i+3<=s.length() && s.charAt(i) == 'W' && s.charAt(i+1) == 'U' && s.charAt(i+2) == 'B'){
                           i = i + 3;

               }
               else{

                   System.out.print(s.charAt(i));
                   if(i+3 < s.length() && s.charAt(i+1)=='W' && s.charAt(i+2) == 'U' && s.charAt(i+3) == 'B')
                       System.out.print(" ");
                    i++;
                   }
               }


       }
       catch(IOException e){
           System.out.println(e.getMessage());
       }
   }
}

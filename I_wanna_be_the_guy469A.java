import java.lang.*;
import java.util.*;
import java.io.*;

public class I_wanna_be_the_guy469A {
     public static void main(String arg[]) throws IOException{
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         ArrayList<Integer> list_ar = new ArrayList();
         int n = Integer.parseInt(reader.readLine());
         String x = reader.readLine();
         String y = reader.readLine();
         int m = Integer.parseInt(x.split(" ")[0]);
         for(int i=1;i<=m;i++){
             list_ar.add(Integer.parseInt(x.split(" ")[i]));
         }
         m = Integer.parseInt(y.split(" ")[0]);
         for(int i=1;i<=m;i++){
             list_ar.add(Integer.parseInt(y.split(" ")[i]));
         }
         int flag=1;
         for(int i=1; i<=n; i++) {
             if (!list_ar.contains(i)) {
                 flag = 0;
             }
         }
         
         if(flag == 0)
              System.out.println("Oh, my keyboard!");
          else
              System.out.println("I become the guy.");



             }

         }





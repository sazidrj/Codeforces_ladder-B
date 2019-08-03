import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
 public class Games {
     public static void main(String[] arg){
         try {
             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             int arrA[] = new int[30];
             int arrB[] = new int[30];
             int n, a, b, count = 0;
             n = Integer.parseInt(reader.readLine());
             for (int i = 0; i < n; i++) {
                 String s = reader.readLine();
                 a = Integer.parseInt(s.split(" ")[0]);
                 b = Integer.parseInt(s.split(" ")[1]);
                 arrA[i] = a;
                 arrB[i] = b;
             }

             for (int i = 0; i < n; i++) {
                 for (int j = 0; j < n; j++) {
                     if (arrA[i] == arrB[j])
                         count++;
                 }
             }
             System.out.println(count);
         }
         catch(IOException e){
             System.out.println(e.getMessage());

         }
     }
}

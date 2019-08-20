import java.util.*;
import java.lang.*;
import java.io.*;
public class Valera_and_Antique_Items441A {
   public static void main(String arg[]) throws IOException{
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<Integer> ar = new ArrayList<>();
       String[] s1 = reader.readLine().trim().split(" ");
       int n = Integer.parseInt(s1[0]);
       int v = Integer.parseInt(s1[1]);
       int sum=0;
       for(int i=1; i<=n; i++) {
           String[] s2 = reader.readLine().trim().split(" ");
           for(int j=1; j<s2.length; j++){
               if(Integer.parseInt(s2[j]) < v){
                   sum++;
                   ar.add(i);
                   break;
               }
           }
       }
       System.out.println(sum);
       for(int i=0; i<ar.size(); i++)
             System.out.print(ar.get(i)+ " ");
   }

}

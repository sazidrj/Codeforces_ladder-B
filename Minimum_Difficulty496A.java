import java.util.*;
import java.lang.*;
import java.io.*;

public class Minimum_Difficulty496A {
   public static void main(String arg[]) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<Integer> ar = new ArrayList<>();
       ArrayList<Integer> ar1 = new ArrayList<>();
       String[] s1 = reader.readLine().trim().split(" ");
       int n = Integer.parseInt(s1[0]);
       String[] s2 = reader.readLine().trim().split(" ");
       for (int i = 0; i < n; i++) {
           ar.add(Integer.parseInt(s2[i]));
       }

      for(int i=1; i<=n-2; i++){
          int max=0,pos=0;
          for(int j=1; j<=n-1; j++ ){
              if(j!=i){
                   max = Math.max(max, ar.get(j)-ar.get(pos));
                   pos=j;
              }
          }
          ar1.add(max);
      }
        Collections.sort(ar1);
        System.out.println(ar1.get(0));
   }

}

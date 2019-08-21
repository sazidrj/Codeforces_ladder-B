import java.lang.*;
import java.io.*;
import java.util.*;
public class Lunch_Rush276A {
   public static void main(String arg[]) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] s1 = reader.readLine().trim().split(" ");
    int n = Integer.parseInt(s1[0]);
    int k = Integer.parseInt(s1[1]);
    int[] f = new int[n];
    int[] t = new int[n];
    int ans,joy;
    ArrayList<Integer> ar = new ArrayList<>();


    for(int i=0; i<n; i++){
         String[] s2 = reader.readLine().trim().split(" ");
         f[i] =  Integer.parseInt(s2[0]);
         t[i] = Integer.parseInt(s2[1]);
    }

        for (int i = 0; i < n; i++) {

            if (t[i] > k)
                joy = f[i] - (t[i] - k);
            else
                joy = f[i];

            ar.add(joy);
        }
        Collections.sort(ar);

        System.out.println(ar.get(ar.size()-1));

   }
}

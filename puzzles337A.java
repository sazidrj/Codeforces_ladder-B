import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class puzzles337A {
    public static void main(String arg[]) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> ar = new  ArrayList();
            String s1 = reader.readLine();
            String s2 = reader.readLine();
            int n = Integer.parseInt(s1.split(" ")[0]);
            int m = Integer.parseInt(s1.split(" ")[1]);
            for(int i=0;i<m;i++){
                int num = Integer.parseInt(s2.split(" ")[i]);
                ar.add(num);
            }
            Collections.sort(ar);
            int min = ar.get(n-1)-ar.get(0);
            for(int i=0;i<m-n+1;i++)
            {
                int diff = ar.get(n-1+i) - ar.get(i);
                if (diff <= min){
                    min = diff;
                }
            }
            System.out.print(min);



        }
        catch(IOException e){
        System.out.println(e.getMessage());
          }
    }
}

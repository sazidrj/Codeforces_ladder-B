import java.lang.*;
import java.util.*;
import java.io.*;

public class Soft_Drinking151A {
  public static void main(String arg[]) throws IOException{
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      ArrayList<Integer> ar = new ArrayList<>();
      String[] s1 = reader.readLine().trim().split(" ");
      int n = Integer.parseInt(s1[0]);
      int k = Integer.parseInt(s1[1]);
      int l = Integer.parseInt(s1[2]);
      int c = Integer.parseInt(s1[3]);
      int d = Integer.parseInt(s1[4]);
      int p = Integer.parseInt(s1[5]);
      int nl = Integer.parseInt(s1[6]);
      int np = Integer.parseInt(s1[7]);
      ar.add(k*l/nl);
      ar.add(c*d);
      ar.add(p/np);
      Collections.sort(ar);
      System.out.println(ar.get(0)/n);

  }

}

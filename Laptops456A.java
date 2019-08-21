import java.util.*;
import java.lang.*;
import java.io.*;

public class Laptops456A {
  public static void main(String arg[]) throws IOException{
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String[] s1 = reader.readLine().trim().split(" ");
      int n = Integer.parseInt(s1[0]);
      int[] a1 = new int[n];
      int[] a2 = new int[n];
      int flag1=0, flag2=0;
      for(int i=0; i<n; i++){
          String[] s2 = reader.readLine().trim().split(" ");
          int a = Integer.parseInt(s2[0]);
          int b = Integer.parseInt(s2[1]);
          if(a<b)
              flag1 = 1;
          if(a>b)
              flag2 = 1;
      }
      if(flag1==1 && flag2==1)
          System.out.println("Happy Alex");
      else
          System.out.println("Poor Alex");




  }
}

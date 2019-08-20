import java.util.*;
import java.lang.*;
import java.io.*;
public class Appleman_and_Easy_Task462A {
   public static void main(String arg[]) throws IOException{
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String[] s1 = reader.readLine().trim().split(" ");
       int n = Integer.parseInt(s1[0]);
       char[][] ch = new char[n][n];
       for(int i=0; i<n; i++){
           ch[i] = reader.readLine().trim().toCharArray();
       }
       int flag=1;
       for(int i=0; i<n; i++){
           int count=0;
           for(int j=0; j<n; j++){
               if(i-1>=0){
                   if(ch[i-1][j]=='o')
                       count++;
               }
               if(j-1>=0){
                   if(ch[i][j-1]=='o')
                       count++;
               }
               if(i+1 <n){
                   if(ch[i+1][j]=='o')
                       count++;
               }
               if(j+1 <n){
                   if(ch[i][j+1]=='o')
                       count++;
               }
               if(count%2!=0)
               {
                   flag = 0;
               }
           }
       }
        if(flag==1)
            System.out.println("YES");
        else
            System.out.println("NO");

   }
}

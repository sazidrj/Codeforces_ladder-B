import java.lang.*;
import java.util.*;
import java.io.*;

public class Cakeminator330A {
   public static void main(String args[]) throws IOException{
   // Scanner sc = new Scanner(System.in);
  //  int n = sc.nextInt();
  //  int m = sc.nextInt();

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] s = reader.readLine().trim().split(" ");
    int n = Integer.parseInt(s[0]);
    int m = Integer.parseInt(s[1]);
    char[][] cakeminator = new char[n][m];
    for(int i=0; i<n; i++){
    //    for(int j=0; j<m; j++){

            cakeminator[i] = reader.readLine().trim().toCharArray();
      //  }
    }

    int row=0,column=0;
   for(int i=0; i<n; i++){
       int sum=0;
       for(int j=0; j<m; j++){
           if(cakeminator[i][j]=='.'){
               sum++;

           }
       }
       if(sum==m)
           row++;
   }
   for(int i=0; i<m; i++){
       int sum=0;
       for(int j=0; j<n; j++){
           if(cakeminator[j][i]=='.'){
               sum++;
           }
       }
       if(sum==n)
           column++;
   }
     System.out.println(row*m + column*n - row*column);

   }
}

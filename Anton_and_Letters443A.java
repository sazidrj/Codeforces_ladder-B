import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Anton_and_Letters443A {
    public static void main(String arg[]){
        try {
             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

             String s = reader.readLine();
             char[] ar = s.toCharArray();

             Arrays.sort(ar);
             int count=0;
             int n=ar.length;

             for(int i=0;i<n;i++){
                 if(Character.isLetter(ar[i])){
                     if(i<n&&ar[i]!=ar[i+1])
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

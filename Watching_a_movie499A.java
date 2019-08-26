import java.util.*;
import java.lang.*;

public class Watching_a_movie499A {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int count=0;
        int sum=0;
        for(int i=0; i<n; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            while((count+x)<a){
                count+=x;
            }
            sum+= b-count;
            count=b;
        }

        System.out.println(sum);

    }
}
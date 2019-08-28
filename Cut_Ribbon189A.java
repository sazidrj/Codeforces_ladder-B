import java.util.*;
public class Cut_Ribbon189A {
 public static void main(String arg[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     int max=0;
     for(int i=0; i<=n; i+=a){
         for(int j=0; j<=n-i; j+=b){
             float z=(n-i-j)/(float)c;

             if(Math.ceil(z) == Math.floor(z)) {
                 int x = i / a;
                 int y = j / b;
                 max = Math.max(max, x + y + (int) z);
             }
             }
             }
             System.out.println(max);

 }
}

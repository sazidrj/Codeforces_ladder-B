import java.util.*;
import java.lang.*;

public class Cheap_travel466A {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count1 = 0, count2 = 0;
        for (int i = n; i > 0; ) {
            if (i >= m) {
                count1++;
                i = i - m;
            } else if (i < m) {
                count2++;
                i = i - 1;
            } else
                count1++;
        }
        if(a*n < count1 * b + count2 && a*n < (count1 + 1) * b){
            System.out.println(a*n);
        }
        else {
            if (count1 * b + count2 * a < (count1 + 1) * b) {
                System.out.println(count1 * b + count2 * a);
            } else {

                System.out.println((count1 + 1) * b);
            }
        }


    }
}
import java.util.*;
import java.lang.*;
public class Evens_Odds318A {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        long m,n;
        n = sc.nextLong();
        m = sc.nextLong();
        long ans = 0;
        if(n%2 == 0) {
            if (m <= n / 2)
                ans = 2 * m - 1;
            else
                ans = 2 *(m - n/2);
        }
        else{
            if(m<=n/2+1)
                ans = 2 * m - 1;
            else
                ans = 2 * (m - n/2 -1);
        }
        System.out.println(ans);

    }
}

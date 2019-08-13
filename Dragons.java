import java.lang.*;
import java.util.*;
public class Dragons {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] ar1 = new int[n];
        int[] ar2 = new int[n];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            ar1[i] = x;
            ar2[i] = y;

        }
        int temp1, temp2;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-1-i; j++){
                if(ar1[j]>ar1[j+1])
                {

                   temp1 = ar1[j];
                   ar1[j] = ar1[j+1];
                   ar1[j+1] = temp1;
                   temp2 = ar2[j];
                   ar2[j] = ar2[j+1];
                   ar2[j+1] = temp2;
                }
            }
        }

        int count=0;
        for (int i = 0; i < n; i++) {
            if (s > ar1[i]) {
                s = s+ar2[i];
               count = count + 1;
            }
        }

        if(count==n )
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}





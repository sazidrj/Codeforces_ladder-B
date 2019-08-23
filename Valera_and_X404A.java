import java.util.*;
import java.lang.*;

public class Valera_and_X404A {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        char[][] ch = new char[n][n];
        for (int i = 0; i < n; i++) {
            ch[i] = sc.nextLine().toCharArray();

        }
        int k = n - 1, flag = 1;
        char ch1 = ch[0][0], ch2 = ch[0][1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || j == k) {
                    if (ch[i][j] != ch1)
                        flag = 0;
                } else {
                    if (ch[i][j] != ch2)
                        flag = 0;
                }
            }
                k--;
            }
            if (ch1 == ch2)
                flag = 0;

            if (flag == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }




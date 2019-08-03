import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Watermelon {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList();
        String s1 = sc.next();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (ch != '+') {
                ar.add(Character.getNumericValue(ch));
            }
        }

        Collections.sort(ar);
        String s2 = "";
        for (int i = 0; i < ar.size(); i++) {
            s2 = s2 + ar.get(i);

            if (i != ar.size() - 1) {
                s2 = s2 + "+";
            }
        }
        System.out.println(s2);
    }
}
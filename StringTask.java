import java.util.Scanner;
import java.lang.*;
public class StringTask {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String op = "";
        String vowel = "aeiouAEIOU";

        String ip = sc.nextLine();
        for(int i=0;i<ip.length();i++) {
            boolean flag = false;
            for (int j = 0; j < vowel.length(); j++) {
                if (ip.charAt(i) == vowel.charAt(j))
                    flag = true;
            }

            if (flag == false) {
                op = op + ".";
                if ((int)ip.charAt(i) >=65 && (int)ip.charAt(i) <=90){
                    op = op + (char)(ip.charAt(i) +32);
                } else {
                    op = op + ip.charAt(i);
                }

            }


        }
        System.out.println(op);
}
}




import java.lang.*;
import java.io.*;

public class IIya_and_bank_account313A {
    public static void main(String arg[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s1 = new StringBuffer(reader.readLine());
        if(s1.charAt(0)=='-'){
            if(s1.charAt(s1.length()-1)>s1.charAt(s1.length()-2))
                s1.deleteCharAt(s1.length()-1);
            else
                s1.deleteCharAt(s1.length()-2);

            if(s1.charAt(1)=='0'&&s1.length()==2)
                s1.deleteCharAt(0);

        }
        System.out.println(s1);

    }
}

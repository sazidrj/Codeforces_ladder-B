import java.util.Scanner;
import java.lang.*;
import java.util.Scanner;
import java.lang.*;
public class PetyaAndString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        
        if(word1.compareTo(word2)>0)
            System.out.println("1");
        else if(word1.compareTo(word2)==0)
            System.out.println("0");
        else
            System.out.println("-1");
    }
}


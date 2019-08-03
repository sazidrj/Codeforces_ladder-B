import java.util.Scanner;
public class LuckyDivision {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ar[] = {4,7,47,74,447,474,477,744,747,774};
        int n = sc.nextInt();
        for(int i=0; i<ar.length; i++)
        {
            if(n%ar[i] == 0){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}

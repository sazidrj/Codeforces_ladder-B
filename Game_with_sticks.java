import java.util.Scanner;
public class Game_with_sticks {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        int min=n;
        if(m<n)
            min = m;
        if(min%2==0)
            System.out.print("Malvika");
        else
            System.out.print("Akshat");

    }
}

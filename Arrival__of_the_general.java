import java.util.Scanner;
public class Arrival_of_the_general {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i=0; i<n; i++)
            ar[i] = sc.nextInt();
        int max_pos, min_pos, max_value, min_value;
        min_value = ar[0];
        max_value = ar[0];
        min_pos = 0;
        max_pos = 0;
        for(int i=0; i<n; i++)
        {
            if(min_value>=ar[i]){
                min_value = ar[i];
                min_pos = i;
            }
            if(max_value<ar[i]){
                max_value = ar[i];
                max_pos = i;
            }
        }
        if(min_pos<max_pos)
            System.out.print((n-1)-min_pos + max_pos - 1);
        else
            System.out.print((n-1)-min_pos + max_pos);
    }
}
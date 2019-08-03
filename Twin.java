import java.util.Collections;
public class Twin {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar_coin = new  ArrayList();
        int i,n,sum = 0,coin,count = 0,coin_sum = 0;
        n = sc.nextInt();
        for (i=0; i<n; i++){
            coin = sc.nextInt();
            sum = sum+coin;
            ar_coin.add(coin);
        }
        Collections.sort(ar_coin);
        for(i = ar_coin.size()-1; i>=0; i--){
            count++;
            coin_sum += ar_coin.get(i);

            if(coin_sum > (float)(sum/2))
                break;
        }

        System.out.println(count);

    }

}
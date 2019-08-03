import java.util.Scanner;
    public class Presents {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] ar = new int[n];
            for(int i=0; i<n; i++){
                ar[i] = sc.nextInt();
            }
            for(int j = 0; j<n; j++){
                for(int k=0; k<n; k++){
                    if(ar[k] == j+1 ){
                        System.out.print(k+1 + " ");
                        break;
                    }
                }
            }

        }
}

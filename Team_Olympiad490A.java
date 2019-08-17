import java.lang.*;
import java.util.*;

public class Team_Olympiad490A {
   public static void main(String arg[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] ar = new int[n];
       for(int i=0; i<n; i++){
           ar[i] = sc.nextInt();
       }
       ArrayList<Integer> ones = new ArrayList<>();
       ArrayList<Integer> twoes = new ArrayList<>();
       ArrayList<Integer> threes = new ArrayList<>();
       int j=0,k=0,l=0,sum=0;
       for(int i=0; i<n; i++) {
           if (ar[i] == 1) {
               ones.add(i+1);
           }
           if (ar[i] == 2) {
               twoes.add(i+1);
           }
           if (ar[i] == 3) {
               threes.add(i+1);
           }
       }


       int min;
           if(twoes.size()<=ones.size() && twoes.size()<=threes.size())
               min=twoes.size();
           else if(ones.size() <= twoes.size() && ones.size()<=threes.size())
               min=ones.size();
           else
               min = threes.size();

           if(min==0)
               System.out.println(0);
           else {

               System.out.println(min);
               for (int i = 0; i < min; i++) {
                   System.out.print(ones.get(i) + " ");
                   System.out.print(twoes.get(i) + " ");
                   System.out.print(threes.get(i));
                   System.out.println();
               }
           }
       }
   }





package A.Math.BitManupulation;

import java.util.*;

public class WeNeedTheZero_1805A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            int x = 0;
            for(int i=0; i<n; i++){
                x = x ^ a[i];
            }

            if(n%2 != 0){
                System.out.println(x);
            }
            else if(x == 0){
                System.out.println(x);
            }
            else{
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
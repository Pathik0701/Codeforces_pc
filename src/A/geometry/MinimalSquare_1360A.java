package A.geometry;

import java.util.*;

public class MinimalSquare_1360A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int small = Math.min(a,b);
            int large = Math.max(a,b);

            int side = Math.max(2*small, large);

            System.out.println((side*side));
        }
        sc.close();
    }
}
package A.Math;

import java.util.*;

public class CollectingCoins_1294A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();

            int max = Math.max(a, Math.max(b,c));
            int needed = (max-a)+(max-b)+(max-c);

            int total = a+b+c+n;

            if(needed <= n){
                if(total%3 == 0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
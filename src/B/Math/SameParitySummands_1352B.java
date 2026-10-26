package B.Math;

import java.util.*;

public class SameParitySummands_1352B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int rem1 = n - (k - 1);
            if (rem1 > 0 && rem1 % 2 != 0) {
                System.out.println("YES");
                for (int i = 0; i < k - 1; i++) {
                    System.out.print("1 ");
                }
                System.out.println(rem1);
            }
            else {
                int rem2 = n - 2 * (k - 1);
                if (rem2 > 0 && rem2 % 2 == 0) {
                    System.out.println("YES");
                    for (int i = 0; i < k - 1; i++) {
                        System.out.print("2 ");
                    }
                    System.out.println(rem2);
                }
                else {
                    System.out.println("NO");
                }
            }
            t--;
        }
        sc.close();
    }
}
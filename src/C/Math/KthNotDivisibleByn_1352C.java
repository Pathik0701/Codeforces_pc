package C.Math;

import java.util.*;

public class KthNotDivisibleByn_1352C{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long skipped = (k - 1) / (n - 1);

            long ans = k + skipped;

            System.out.println(ans);
        }
        sc.close();
    }
}
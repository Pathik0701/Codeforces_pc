package A.Math;

import java.util.*;

public class AddAndDivide_1485A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            long minOps = Long.MAX_VALUE;

            long startB = Math.max(2, b);

            for (long B = startB; B < startB + 32; B++) {
                long currentOps = B - b;
                long tempA = a;

                while (tempA > 0) {
                    tempA /= B;
                    currentOps++;
                }
                minOps = Math.min(minOps, currentOps);
            }
            System.out.println(minOps);
        }
        sc.close();
    }
}
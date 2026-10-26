package A.Arrays;

import java.util.*;

public class ShiftingStacks_1486A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long currentSum = 0;
            long requiredSum = 0;
            boolean possible = true;

            for (int i = 0; i < n; i++) {
                long h = sc.nextLong(); // Read each stack height one by one
                currentSum += h;
                requiredSum += i;

                if (currentSum < requiredSum) {
                    possible = false;
                }
            }

            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
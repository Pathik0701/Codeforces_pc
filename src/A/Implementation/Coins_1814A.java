package A.Implementation;

import java.util.*;

public class Coins_1814A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            if (n % 2 == 0 || (n - k) % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
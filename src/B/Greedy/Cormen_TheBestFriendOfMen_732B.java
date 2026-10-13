package B.Greedy;

import java.util.*;

public class Cormen_TheBestFriendOfMen_732B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int additionalWalks = 0;

        for (int i = 1; i < n; i++) {
            int currentSum = a[i] + a[i - 1];
            if (currentSum < k) {
                int needed = k - currentSum;
                a[i] += needed;          // Add the missing walks to the current day
                additionalWalks += needed; // Keep track of the total added walks
            }
        }
        System.out.println(additionalWalks);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + (i == n - 1 ? "" : " "));
        }
        System.out.println();
        sc.close();
    }
}
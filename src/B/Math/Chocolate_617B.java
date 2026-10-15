package B.Math;

import java.util.*;

public class Chocolate_617B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long totalWays = 0;
        int lastNutIndex = -1;

        for (int i = 0; i < n; i++) {
            int piece = sc.nextInt();

            if (piece == 1) {
                if (lastNutIndex == -1) {
                    totalWays = 1;
                } else {
                    totalWays *= (i - lastNutIndex);
                }
                lastNutIndex = i;
            }
        }
        System.out.println(totalWays);
        sc.close();
    }
}

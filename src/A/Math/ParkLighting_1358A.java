package A.Math;

import java.util.*;

public class ParkLighting_1358A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int ans = (n * m + 1) / 2;
            System.out.println(ans);
        }
        sc.close();
    }
}
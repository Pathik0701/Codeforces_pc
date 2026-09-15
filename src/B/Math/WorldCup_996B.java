package B.Math;

import java.util.*;

public class WorldCup_996B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long minTime = Long.MAX_VALUE;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            long time;
            if (a[i] <= i) {
                time = i;
            }
            else {
                long difference = a[i] - i;
                long rounds = (difference + n - 1) / n;
                time = i + rounds * n;
            }
            if (time < minTime) {
                minTime = time;
                answer = i;
            }
        }
        System.out.println(answer + 1);
        sc.close();
    }
}

package B.simulation;

import java.util.*;

public class XeniaAndRingroad_339B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int m = sc.nextInt();

        long currentHouse = 1;
        long totalTime = 0;

        for (int i = 0; i < m; i++) {
            long nextHouse = sc.nextLong();

            if (nextHouse >= currentHouse) {
                totalTime += (nextHouse - currentHouse);
            } else {
                totalTime += (n - currentHouse + nextHouse);
            }
            currentHouse = nextHouse;
        }
        System.out.println(totalTime);
        sc.close();
    }
}
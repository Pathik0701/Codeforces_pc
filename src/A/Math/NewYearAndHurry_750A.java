package A.Math;

import java.util.*;

public class NewYearAndHurry_750A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int timeLimit = 240;
        int availableTime = timeLimit - k;

        int problemsSolved = 0;

        for (int i = 1; i <= n; i++) {
            int timeNeeded = 5 * i;

            if (availableTime >= timeNeeded) {
                availableTime -= timeNeeded;
                problemsSolved++;
            } else {
                break;
            }
        }
        System.out.println(problemsSolved);
        sc.close();
    }
}

package A.Implementation;

import java.util.*;

public class ArrivalOfTheGeneral_144A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];

        for(int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int max = h[0];
        int min = h[0];

        int maxIndex = 0;
        int minIndex = 0;

        for(int i = 0; i < n; i++) {
            if(h[i] > max) {
                max = h[i];
                maxIndex = i;
            }
        }

        for(int i = 0; i < n; i++) {
            if(h[i] <= min) {
                min = h[i];
                minIndex = i;
            }
        }

        int answer;

        if(maxIndex < minIndex) {
            answer = maxIndex + (n - 1 - minIndex);
        }
        else {
            answer = maxIndex + (n - 1 - minIndex) - 1;
        }

        System.out.println(answer);

        sc.close();
    }
}

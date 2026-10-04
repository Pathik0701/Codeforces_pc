package B.Strings;

import java.util.*;

public class TwoGram_977B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        String[] result = new String[n - 1];

        for (int i = 0; i < n - 1; i++) {
            result[i] = s.substring(i, i + 2);
        }

        String answer = "";
        int maxCount = 0;

        for (int i = 0; i < n - 1; i++) {
            int count = 0;

            for (int j = 0; j < n - 1; j++) {

                if (result[i].equals(result[j])) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                answer = result[i];
            }
        }
        System.out.println(answer);

        sc.close();
    }
}
package A.Math;

import java.util.*;

public class RestoringThreeNumbers_1154A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[4];
        for (int i = 0; i < 4; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);
        int totalSum = numbers[3];

        int a = totalSum - numbers[0];
        int b = totalSum - numbers[1];
        int c = totalSum - numbers[2];

        System.out.println(a + " " + b + " " + c);

        sc.close();
    }
}

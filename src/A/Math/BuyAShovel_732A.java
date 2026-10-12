package A.Math;

import java.util.Scanner;

public class BuyAShovel_732A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();

        for (int n = 1; n <= 10; n++) {
            int totalCost = n * k;

            if (totalCost % 10 == 0 || totalCost % 10 == r) {
                System.out.println(n);
                break;
            }
        }
        sc.close();
    }
}
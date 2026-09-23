package A.Implementation;

import java.util.Scanner;

public class GeorgeAndAccommodation_467A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int suitableRooms = 0;

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();

            if (q - p >= 2) {
                suitableRooms++;
            }
        }
        System.out.println(suitableRooms);

        sc.close();
    }
}

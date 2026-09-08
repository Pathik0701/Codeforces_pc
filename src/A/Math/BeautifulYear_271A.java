package A.Math;

import java.util.*;

public class BeautifulYear_271A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        for(int i = y + 1; ; i++) {

            boolean[] seen = new boolean[10];
            boolean beautiful = true;

            int number = i;

            while(number > 0) {
                int digit = number % 10;

                if(seen[digit]) {
                    beautiful = false;
                    break;
                }

                seen[digit] = true;
                number /= 10;
            }

            if(beautiful) {
                System.out.println(i);
                break;
            }
        }

        sc.close();
    }
}

package A.Implementation;

import java.util.Scanner;

public class NearlyluckyNumber_110A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int luckyCount = 0;

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (c == '4' || c == '7') {
                luckyCount++;
            }
        }

        if (luckyCount == 4 || luckyCount == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}

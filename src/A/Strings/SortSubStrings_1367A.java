package A.Strings;

import java.util.Scanner;

public class SortSubStrings_1367A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                String b = sc.next();

                StringBuilder a = new StringBuilder();

                a.append(b.charAt(0));

                for (int j = 1; j < b.length(); j += 2) {
                    a.append(b.charAt(j));
                }

                System.out.println(a.toString());
            }
        }
        sc.close();
    }
}

package A.Math;

import java.util.*;


public class SoftDrinking_151A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int drink = (k*l) / nl;
        int limes = c * d;
        int salt = p / np;

        int toastrequired = Math.min(drink, Math.min(limes, salt));

        System.out.println(toastrequired / n);

        sc.close();
    }
}

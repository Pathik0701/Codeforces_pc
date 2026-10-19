package B.simulation;

import java.util.*;

public class Buttons_268B{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long totalpress = n;

        for(long i=0; i<n; i++){
            totalpress += (n-i) * i;
        }

        System.out.println(totalpress);
        sc.close();
    }
}
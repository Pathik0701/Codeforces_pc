package A.Arrays;

import java.util.*;

public class Tram_116A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int current = 0;
        int max = 0;

        for(int i=0; i<n; i++){
            int leaving = sc.nextInt();
            int entering = sc.nextInt();

            current = current - leaving + entering;

            if(current > max){
                max = current;
            }
        }
        System.out.println(max);

        sc.close();
    }
}

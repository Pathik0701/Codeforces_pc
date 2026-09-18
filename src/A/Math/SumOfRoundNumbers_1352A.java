package A.Math;

import java.util.*;

public class SumOfRoundNumbers_1352A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            int number = sc.nextInt();
            int place = 1;
            int count = 0;
            List<Integer> digits = new ArrayList<>();

            while(number>0){
                int digit = number%10;
                int roundNumber = digit*place;

                if(digit != 0){
                    count++;
                    digits.add(roundNumber);
                }

                number = number/10;
                place = place*10;
            }
            System.out.println(count);
            for(int digit : digits){
                System.out.println(digit + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

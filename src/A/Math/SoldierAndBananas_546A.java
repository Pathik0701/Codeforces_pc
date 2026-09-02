package A.Math;

import java.util.*;

public class SoldierAndBananas_546A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int InitialCost = sc.nextInt();
        int Money = sc.nextInt();
        int BananasWant = sc.nextInt();

        int TotalCost = 0;

        for(int i=1; i<=BananasWant; i++){
            TotalCost += (i*InitialCost);
        }

        if(TotalCost > Money){
            int borrow = TotalCost - Money;
            System.out.println(borrow);
        }
        else{
            System.out.println(0);
        }
        sc.close();
    }
}
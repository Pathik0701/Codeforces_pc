package A.Math;

import java.util.*;

public class IlyaAndBankAccount_313A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int option1 = 0;
        int option2 = 0;
        if(n >= 0){
            option1 = n;
            option2 = n;
        }
        if(n < 0){
            option1 = n/10;
            option2 = (n/100)*10 + n%10;
        }
        System.out.println(Math.max(option1, option2));
        sc.close();
    }
}

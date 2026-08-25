package A.Math;

import java.util.Scanner;

public class LuckyDivision_122A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int check = 0;

        int[] arr = {4,47,44,474,477,444,447,7,74,77,747,744,774,777};
        for(int num : arr){
            if(n%num == 0){
                check = 1;
            }
        }
        if(n%4==0 || n%7==0){
            check = 1;
        }

        if(check == 1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}

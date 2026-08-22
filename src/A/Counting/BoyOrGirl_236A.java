package A.Counting;

import java.util.Scanner;

public class BoyOrGirl_236A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] seen = new int[26];
        int distinct = 0;

        for (char c : s.toCharArray()){
            int index = c -'a';

            if(seen[index]==0){
                distinct++;
                seen[index] = 1;
            }
        }

        if(distinct % 2 ==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}

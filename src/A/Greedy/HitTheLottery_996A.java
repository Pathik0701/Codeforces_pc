package A.Greedy;

import java.util.*;

//public class HitTheLottery_996A{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int count = 0;
//        int remaining = n;
//
//        while(remaining >= 100){
//            count += remaining/100;
//            remaining %= 100;
//        }
//        while(remaining >= 20){
//            count += remaining/20;
//            remaining %= 20;
//        }
//        while(remaining >= 10){
//            count += remaining/10;
//            remaining %= 10;
//        }
//        while(remaining >= 5){
//            count += remaining/5;
//            remaining %= 5;
//        }
//        count += remaining;
//
//        System.out.println(count);
//
//        sc.close();
//    }
//}


public class HitTheLottery_996A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bills = {100,20,10,5,1};
        int answer = 0;

        for (int bill : bills){
            answer += n/bill;
            n %= bill;
        }
        System.out.println(answer);
        sc.close();
    }
}
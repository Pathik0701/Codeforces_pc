package B.Greedy;

import java.util.*;

public class Gifts_fixing_1399B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0; i<t; i++){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for(int j=0; j<n; j++){
                a[j] = sc.nextInt();
            }
            for(int j=0; j<n; j++){
                b[j] = sc.nextInt();
            }

            //find min value in the Array
            int min_a = a[0];
            int min_b = b[0];
            for(int j=1; j<n; j++){
                min_a = Math.min(min_a, a[j]);
                min_b = Math.min(min_b, b[j]);
            }

            //Used long because the total sum of the numbers exceeds the limit of int Data type...
            long count = 0;

            for(int j=0; j<n; j++){
                //difference of the min value of the array with every values...
                int diff_a = a[j] - min_a;
                int diff_b = b[j] - min_b;
                //add the max value of the diff a and b...
                count += Math.max(diff_a, diff_b);
            }
            System.out.println(count);
        }
        sc.close();
    }
}




//public class Gifts_fixing_1399B{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-- > 0){
//            int n = sc.nextInt();
//
//            long[] a = new long[n];
//            long[] b = new long[n];
//
//            for(int j=0; j<n; j++){
//                a[j] = sc.nextLong();
//            }
//            for(int j=0; j<n; j++){
//                b[j] = sc.nextLong();
//            }
//
//            long min_a = a[0];
//            long min_b = b[0];
//            for(int j=1; j<n; j++){
//                min_a = Math.min(min_a, a[j]);
//                min_b = Math.min(min_b, b[j]);
//            }
//
//            long count = 0;
//
//            for(int j=0; j<n; j++){
//                long diff_a = a[j] - min_a;
//                long diff_b = b[j] - min_b;
//                count += Math.max(diff_a, diff_b);
//            }
//            System.out.println(count);
//        }
//        sc.close();
//    }
//}
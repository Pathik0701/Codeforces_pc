package A.Math;

import java.util.*;
public class TheNewYearMeetingFriends_723A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int x1 = arr[1] - arr[0];
        int x2 = arr[2] - arr[1];
        System.out.println(x1 + x2);
        sc.close();
    }
}

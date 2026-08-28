package A.Greedy;

import java.util.*;

//Greedy + Sorting
public class Twins_160A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int mysum = 0;
        int total = 0;
        int count = 0;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            total = total + arr[i];
        }

        Arrays.sort(arr);

        for(int i=arr.length-1; i>=0; i--){
            mysum = mysum + arr[i];
            count++;
            if(mysum > total - mysum){
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
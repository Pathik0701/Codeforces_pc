package A.Counting;

import java.util.*;

public class ILoveUsername_155A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] record = new int[n];
        for(int i=0; i<n; i++){
            record[i] = sc.nextInt();
        }
        int max = record[0];
        int min = record[0];

        int count = 0;

        for(int i=1; i<n; i++){
            if(record[i] > max){
                max = record[i];
                count++;
            }

            if(record[i] < min){
                min = record[i];
                count++;
            }
        }
        System.out.println(count);

        sc.close();
    }
}

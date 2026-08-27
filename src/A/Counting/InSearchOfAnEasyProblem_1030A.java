package A.Counting;

import java.util.*;

public class InSearchOfAnEasyProblem_1030A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] x = new int[n];
        for(int i=0; i<n; i++){
            x[i] = sc.nextInt();
        }
        int count = 0;

        for(int i=0; i<n; i++){
            if(x[i] == 1){
                count++;
            }
        }

        if(count == 0){
            System.out.println("EASY");
        }else{
            System.out.println("HARD");
        }

        sc.close();
    }
}

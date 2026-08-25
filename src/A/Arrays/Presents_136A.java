package A.Arrays;

import java.util.*;

public class Presents_136A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] answers = new int[n+1];

        for(int i=1; i<=n; i++){ //i gave the present to p[i]
            int p = sc.nextInt();
            answers[p] = i;
        }

        for(int i=1; i<=n; i++){
            System.out.println(answers[i] + " ");
        }

        sc.close();

    }
}

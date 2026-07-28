package A;

import java.util.Scanner;

public class NextRound_158A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] scores = new int[n];
        for(int i=0; i<n; i++){
            scores[i] = sc.nextInt();
        }

        int qualifyingScore = scores[k-1];
        int answer = 0;

        for(int score : scores){
            if(score >= qualifyingScore && score>0){
                answer++;
            }
        }
        System.out.println(answer);
        sc.close();
    }
}

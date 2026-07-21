package A;

import java.util.Scanner;

public class Team_231A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int correct_sol = 0;

        for (int i=0; i<n; i++){

            int sol_petya = sc.nextInt();
            int sol_vasya = sc.nextInt();
            int sol_tonya = sc.nextInt();

            int count = sol_petya + sol_vasya + sol_tonya;


            if(count >= 2){
                correct_sol++;
            }
        }
        System.out.println(correct_sol);
        sc.close();
    }
}

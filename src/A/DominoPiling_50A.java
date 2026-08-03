package A;

import java.util.Scanner;

public class DominoPiling_50A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        int total = M*N;

        System.out.println(total/2);
        sc.close();
    }
}

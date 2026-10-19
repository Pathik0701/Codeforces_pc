package A.Simulation;

import java.util.*;

public class VanyaAndCubes_492A{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int used = 0;
        int height = 0;
        int layercube = 0;

        while(true){
            height++;
            layercube += height;

            if(used + layercube > n){
                break;
            }

            used += layercube;
        }
        System.out.println(height-1);
        sc.close();
    }
}
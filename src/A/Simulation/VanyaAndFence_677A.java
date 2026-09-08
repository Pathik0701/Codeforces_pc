package A.Simulation;

import java.util.*;

public class VanyaAndFence_677A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] height = new int[n];
        for(int i=0; i<n; i++){
            height[i] = sc.nextInt();
        }

        int w = 0;

        for(int i=0; i<n; i++){
            if(height[i] > h){
                w += 2;
            }
            else{
                w++;
            }
        }
        System.out.println(w);
        sc.close();
    }
}


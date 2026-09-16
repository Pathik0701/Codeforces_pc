package A.Sorting;

import java.util.*;

public class RemoveSmallest_1399A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int j=0; j<n; j++){
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);

            boolean possible = true;

            for(int k = 1; k < n; k++){
                if(arr[k] - arr[k-1] > 1){
                    possible = false;
                    break;
                }
            }

            if(possible){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

package B.Sorting;

import java.util.*;

public class CollectingPackages_1294B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder("");

            int[][] packages = new int[n][2];

            for(int j=0; j<n; j++){
                packages[j][0] = sc.nextInt();
                packages[j][1] = sc.nextInt();
            }
            Arrays.sort(packages, (p1,p2) ->{
                if(p1[0] != p2[0]){
                    return Integer.compare(p1[0], p2[0]);
                }
                return Integer.compare(p1[1], p2[1]);
            });

            boolean possible = true;

            for(int k=0; k<n-1; k++){
                if(packages[k][1] > packages[k+1][1]){
                    possible = false;
                    break;
                }
            }

            if(possible){
                int currentx = 0;
                int currenty = 0;

                for(int k=0; k<n; k++){
                    int x = packages[k][0];
                    int y = packages[k][1];

                    for(int r=currentx; r<x; r++){
                        sb.append("R");
                    }
                    currentx = x;

                    for(int s=currenty; s<y; s++){
                        sb.append("U");
                    }
                    currenty = y;
                }
                System.out.println("YES");
                System.out.println(sb);
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
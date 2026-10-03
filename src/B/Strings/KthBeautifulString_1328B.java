package B.Strings;

import java.util.*;

public class KthBeautifulString_1328B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();

            char[] ans = new char[n];
            Arrays.fill(ans, 'a');

            for(int i=n-2; i>=0; i--){
                long count = n-1-i;
                if(k>count){
                    k = k - count;
                }
                else{
                    ans[i] = 'b';
                    ans[(int)(n-k)] = 'b';
                    break;
                }
            }
            System.out.println(new String(ans));
        }
        sc.close();
    }
}
package B.implementation;

import java.util.*;

public class QueueAtTheSchool_266B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();

        char[] q = s.toCharArray();

        while(t-- > 0){
            for(int i=0; i<n-1; i++){
                if(q[i]=='B'&& q[i+1]=='G'){
                    q[i] = 'G';
                    q[i+1] = 'B';
                    i++;
                }
            }
        }
        System.out.println(new String(q));
        sc.close();
    }
}
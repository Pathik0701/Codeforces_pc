package A.Strings;

import java.util.*;

public class Magnets_344A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        String previous = "";

        for(int i=0; i<n; i++){
            String current = sc.next();

            if(!previous.equals(current)){
                count++;
            }
            previous = current;
        }
        System.out.println(count);
        sc.close();
    }
}

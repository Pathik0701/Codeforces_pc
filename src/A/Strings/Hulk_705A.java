package A.Strings;

import java.util.*;

public class Hulk_705A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = "";

        for(int i=1; i<=n; i++){
            if(i%2 == 1){
                result += "I hate";
            }
            else{
                result += "I love";
            }

            if(i==n){
                result += " it";
            }
            else{
                result += " that ";
            }
        }
        System.out.println(result);

        sc.close();
    }
}

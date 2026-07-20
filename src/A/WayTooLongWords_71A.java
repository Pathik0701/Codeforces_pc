package A;

import java.util.Scanner;

public class WayTooLongWords_71A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            String word = sc.next();
            int len = word.length();
            char first_str = word.charAt(0);
            char last_str = word.charAt(len-1);

            if(len > 10){
                System.out.println("" + first_str + (len-2) + last_str);
            }
            else{
                System.out.println(word);
            }
        }
        sc.close();
    }
}


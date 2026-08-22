package A.Counting;

import java.util.Scanner;

public class Word_59A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int upper = 0;
        int lower = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                upper++;
            }
            else if(Character.isLowerCase(c)){
                lower++;
            }
        }

        if(upper>lower){
            System.out.println(s.toUpperCase());
        }else{
            System.out.println(s.toLowerCase());
        }

        sc.close();
    }
}

package A;

import java.util.Scanner;

public class WordCapitalization_281A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String sentence = sc.next();
        String after_part = sentence.substring(1);

        char c = sentence.charAt(0);

        System.out.println(Character.toUpperCase(c)+after_part);

        sc.close();
    }
}

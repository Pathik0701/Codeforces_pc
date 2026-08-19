package A;

import java.util.Scanner;

public class PetyaAndStrings_112A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int c = a.compareToIgnoreCase(b);
        if(c==0){
            System.out.println("0");
        }
        else if(c>0){
            System.out.println("1");
        }
        else{
            System.out.println("-1");
        }

        sc.close();
    }
}

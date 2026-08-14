package A;

import java.util.Scanner;

public class HelpfulMaths_339A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); //1+2+3+1
        int one = 0;
        int two = 0;
        int three = 0;

        for(char c : s.toCharArray()){
            if(c == '1'){
                one++;
            }
            else if(c == '2'){
                two++;
            }
            else if(c == '3'){
                three++;
            }
        }

        String result = "";
        boolean first = true;

        for(int i=0; i<one; i++){
            if(!first){
                result += "+";
            }
            result += "1";
            first = false;

        }
        for(int i=0; i<two; i++){
            if(!first){
                result += "+";
            }
            result += "2";
            first = false;
        }
        for(int i=0; i<three; i++){
            if(!first){
                result += "+";
            }
            result += "3";
            first = false;
        }

        System.out.println(result);

        sc.close();
    }
}


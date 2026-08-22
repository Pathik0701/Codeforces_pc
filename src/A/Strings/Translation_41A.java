package A.Strings;

import java.util.Scanner;

//Two-Pointer Approach
public class Translation_41A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String l = sc.next();

        int i = 0;
        int j = s.length()-1;

        boolean match = true;

        if(s.length() != l.length()){
            match = false;
        }else{
            while (i<s.length()){
                if(s.charAt(j)!=l.charAt(i)){
                    match = false;
                    break;
                }
                i++;
                j--;
            }
        }

        if(match){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}


//Alternate Solution
// - Using StringBuilder
//import java.util.Scanner;
//
//public class Main{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        String l = sc.next();
//        if(s.length() != l.length()){
//            System.out.println("NO");
//        }
//        else{
//            String reversed = new StringBuilder(s).reverse().toString();
//            if (reversed.equals(l)) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//        }
//        sc.close();
//    }
//}

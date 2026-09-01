package A.Counting;

import java.util.*;

public class AntonAndLetters_443A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Set<Character> s = new HashSet<>();

        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);

            if(c >= 'a' && c <= 'z'){
                s.add(c);
            }
        }

        System.out.println(s.size());

        sc.close();
    }
}

// ALSO :
//public class AntonAndLettersSimple {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//
//        // 1. Remove brackets, spaces, and commas
//        String cleanInput = input.replaceAll("[{}, ]", "");
//
//        // 2. Count distinct characters
//        long count = cleanInput.chars().distinct().count();
//
//        System.out.println(count);
//        scanner.close();
//    }
//}


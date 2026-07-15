import java.util.Scanner;

public class Watermelon_4A
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("int number w:");
        int w = sc.nextInt();

        if(w>2 && w%10==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}

package A.Implementation;


import java.io.*;
import java.util.StringTokenizer;

public class OddOneOut_1915A{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int uniqueValue = a ^ b ^ c;

            sb.append(uniqueValue).append("\n");
        }
        System.out.print(sb);
    }
}

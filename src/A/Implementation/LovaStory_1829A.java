package A.Implementation;

import java.io.*;
import java.util.StringTokenizer;

public class LovaStory_1829A{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        String target = "codeforces";
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String s = br.readLine();
            int diffCount = 0;
            for (int i = 0; i < 10; i++) {
                if (s.charAt(i) != target.charAt(i)) {
                    diffCount++;
                }
            }
            sb.append(diffCount).append("\n");
        }
        System.out.print(sb);
    }
}

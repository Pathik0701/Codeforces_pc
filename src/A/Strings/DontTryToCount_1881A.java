package A.Strings;

import java.io.*;
import java.util.StringTokenizer;

public class DontTryToCount_1881A{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        String line = br.readLine();
        if (line == null) return;
        st = new StringTokenizer(line);
        int t = Integer.parseInt(st.nextToken());

        StringBuilder output = new StringBuilder();

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            String x = br.readLine();
            String s = br.readLine();

            int ops = 0;
            boolean found = false;

            while (ops <= 6) {
                if (x.contains(s)) {
                    output.append(ops).append("\n");
                    found = true;
                    break;
                }
                x = x + x;
                ops++;
            }
            if (!found) {
                output.append(-1).append("\n");
            }
        }
        System.out.print(output);
    }
}

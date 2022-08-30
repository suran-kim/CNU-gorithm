package week4.sangGyun.D1912;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];
        dp[0] = -1001;
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = dp[0];
        for(int i = 1; i < n + 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
            max = Math.max(max, dp[i]);
        }
        
        bw.write(max + "");
        bw.flush();

        br.close();
        bw.close();
    }
}

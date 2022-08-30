package week4.sangGyun.D2156;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];
        int[] arr = new int[n + 1];

        for(int i = 1; i < n + 1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = arr[1];
        if(n >= 2) dp[2] = dp[1] + arr[2];

        if(n >= 3) {
            for(int i = 3; i < n + 1; i++) {
                int max = Math.max(dp[i - 3] + arr[i - 1] + arr[i], dp[i - 2] + arr[i]);
                dp[i] = Math.max(max, dp[i - 1]);
            }
        }

        bw.write(dp[n] + "");

        br.close();
        bw.close();
    }
}

package week4.sangGyun.D2193;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long[] dp = new long[91];
        int n = Integer.parseInt(br.readLine());
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        
        for(int i = 4; i < 91; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        bw.write(dp[n] + "\n");
        br.close();
        bw.close();
    }
}

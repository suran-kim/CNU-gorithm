package week4.sangGyun.D1932;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][];
        int[][] dp = new int[n][];

        for(int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            for(int j = 0; j < str.length; j++) {
                if(j == 0) {
                    arr[i] = new int[str.length];
                    dp[i] = new int[str.length];
                }
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        dp[0][0] = arr[0][0];
        
        int max = 0;
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(j == 0) dp[i][j] = dp[i - 1][0] + arr[i][0];
                if(j == arr[i].length - 1) dp[i][j] = dp[i - 1][j - 1] + arr[i - 1][j - 1];
                else {
                    dp[i][j] = Math.max(
                        dp[i - 1][j - 1] + arr[i][j],
                        dp[i - 1][j] + arr[i][j]
                    );
                }
                if(i == n - 1) max = Math.max(max, dp[i][j]);
            }
        }

        bw.write(max + "");
        bw.flush();
        br.close();
        bw.close();
    }
}

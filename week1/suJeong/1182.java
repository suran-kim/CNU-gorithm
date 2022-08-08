import java.util.Scanner;

public class Main {
    //개수, 결과, 배열, 답
    static int n;
    static int s;
    static int[] arr;
    static int cnt;

    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //dfs(idx, 합)
        dfs(0, 0);

        //s 0일 때 공집합 빼주기
        System.out.println(s == 0 ? cnt-1 : cnt);
    }

    //n까지 다 돌았을때 결과랑 같으면 답++
    //더한다.더하지 않는다.
    private static void dfs(int idx, int sum) {
        if (idx == n) {
            if (sum == s) cnt++;
            return;
        }

        dfs(idx + 1, sum);
        dfs(idx + 1, sum + arr[idx]);
    }
}
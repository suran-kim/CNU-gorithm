import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);

        int cnt = 1;
        int max = 1;
        long answer = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                cnt++;
                if (cnt > max) {
                    max = cnt;
                    answer = arr[i];
                }
            } else {
                cnt = 1;
            }
        }
        System.out.println(answer);
    }
}

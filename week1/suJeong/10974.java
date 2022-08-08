import java.util.Scanner;

public class Main {

    static int[] arr;
    static boolean[] isVisited;
    static int n;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        isVisited = new boolean[n];
        dfs(0);
    }

    private static void dfs(int idx) {
        if (idx == n) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                arr[idx] = i + 1;
                dfs(idx + 1);
                isVisited[i] = false;
            }
        }
    }
}
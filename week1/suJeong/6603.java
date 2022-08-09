import java.util.Scanner;

public class Main {
    static int[] arr;
    static boolean[] check;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            n = sc.nextInt();
            if(n==0) break;
            arr = new int[n];
            check = new boolean[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            dfs(0,0);
            System.out.println();
        }
    }

    private static void dfs(int start, int idx) {
        if (idx == 6) {
            for (int i = 0; i < n; i++) {
                if(check[i]){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
            return;
        }

        for (int i = start; i < n; i++) {
            check[i] = true;
            dfs(i + 1, idx + 1);
            check[i] = false;
        }
    }
}

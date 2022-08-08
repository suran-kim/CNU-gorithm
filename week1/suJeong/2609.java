import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int gcd = gcd(max, min);
        System.out.println(gcd);
        System.out.println(a * b / gcd);
    }

    private static int gcd(int max, int min) {
        if (max % min == 0) return min;
        return gcd(min, max % min);
    }
}
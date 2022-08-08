import java.util.Scanner;

public class Main {
    //소수 배열
    static boolean[] prime = new boolean[10001];

    public static void main(String[] args) {
        //소수 구하기
        getPrime();

        //테스트 개수만큼 반복, 반으로 나눠서 하나는 ++, -- 두개 모두 소수 일 때 출력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int a = num / 2;
            int b = num / 2;
            while (true) {
                if (!prime[a] && !prime[b]) {
                    System.out.println(a+" "+b);
                    break;
                }
                a--;
                b++;
            }
        }
    }

    //0,1 소수 아님(true) ,2부터 루트값까지 돌면서 소수 아닌것 true로 만듦 i의 배수들
    private static void getPrime() {
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }

}
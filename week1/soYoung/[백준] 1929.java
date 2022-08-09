import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static boolean[] numbers;
	static int N, M;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		if (M == 1) {
			M++;
		}
		numbers = new boolean[N - M + 1];
		findPrime();

		StringBuilder sb = new StringBuilder();
		for (int i = M; i <= N; i++) {
			if (!numbers[i - M]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb.toString());
	}

	public static void findPrime() {
		for (int i = 2; i <= Math.sqrt(N); i++) {
			int j = (int) Math.ceil((double) M / (double) i);
			while (true) {
				int num = j * i;
				if (num > N) {
					break;
				}
				if (i != num) {
					numbers[num - M] = true;
				}
				j++;
			}
		}
	}
}
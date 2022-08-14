import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(i + 1);
        }
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (q.size()>1) {
            cnt++;
            if (cnt == s) {
                sb.append(q.poll()).append(", ");
                cnt = 0;
            } else {
                q.add(q.poll());
            }
        }
        sb.append(q.poll()).append(">");
        System.out.println(sb);
    }
}

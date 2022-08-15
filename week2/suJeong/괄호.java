import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(answer(sc.next()));
        }
    }

    private static String answer(String str) {
        Stack<Character> stack = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n ; i++) {
            if(str.charAt(i)=='(') stack.push('(');
            else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";
        return "YES";
    }
}

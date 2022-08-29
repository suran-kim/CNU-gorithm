package week3.sangGyun.R10814;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<String> pq = new PriorityQueue<>((o1, o2) -> {
            int n1 = Integer.parseInt(o1.split(" ")[0]);
            int n2 = Integer.parseInt(o2.split(" ")[0]);
            if(n1 == n2) {
                return 0;
            }
            
            return n1 - n2;
        });
        for(int i = 0; i < n; i++) {
            pq.add(br.readLine());
        }

        for(int i = 0; i < n; i++) {
            bw.write(pq.poll() + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}

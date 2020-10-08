package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number1158 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        sb.append("<");

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(i + 1);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < k; i++) {
                // k번째 체크(k 번째라면 poll)
                if(i == k-1) {
                    sb.append(queue.poll() + ", ");
                    // k 번째가 아니면, 뒤로 이동
                } else {
                    queue.add(queue.poll());
                }
            }
        }

        System.out.println(sb.substring(0, sb.length() -2) + ">");
    }
}

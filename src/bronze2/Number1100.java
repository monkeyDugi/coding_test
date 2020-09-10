package bronze2;

/**
 * 문제
 * 체스판은 8*8크기이고, 검정 칸과 하얀 칸이 번갈아가면서 색칠되어 있다. 가장 왼쪽 위칸 (0,0)은 하얀색이다. 체스판의 상태가 주어졌을 때, 하얀 칸 위에 말이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄부터 8개의 줄에 체스판의 상태가 주어진다. ‘.’은 빈 칸이고, ‘F’는 위에 말이 있는 칸이다.
 *
 * 출력
 * 첫째 줄에 문제의 정답을 출력한다.
 *
 * 예제 입력 1
 * .F.F...F
 * F...F.F.
 * ...F.F.F
 * F.F...F.
 * .F...F..
 * F...F.F.
 * .F.F.F.F
 * ..FF..F.
 * 예제 출력 1
 * 1
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1100 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[8][8];
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine().split("");

            for (int j = 0; j < arr[i].length; j++) {
                // 홀수행
                if (i % 2 == 1) {
                    // 훌수열(하얀칸)
                    if (j % 2 == 1) {
                        if ("F".equals(arr[i][j])) {
                            cnt++;
                        }
                    }
                    // 짝수행
                } else {
                    // 짝수행(하얀칸)
                    if (j % 2 == 0) {
                        if ("F".equals(arr[i][j])) {
                            cnt++;
                        }
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}

package bronze5;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 문제
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * ex) 1 4
 *
 * 출력
 * 첫째 줄에 A+B를 출력한다.
 */
public class Number1000 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String line = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(line);
//        int reuslt = 0;
//        while (st.hasMoreTokens()) {
//            reuslt += Integer.parseInt(st.nextToken());
//        }
//
//        System.out.println(reuslt);

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b);
    }
}
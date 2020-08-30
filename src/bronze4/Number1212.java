package bronze4;

import java.util.Scanner;

/**
 * 문제
 * 8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 8진수가 주어진다. 주어지는 수의 길이는 333,334을 넘지 않는다.
 *
 * 출력
 * 첫째 줄에 주어진 수를 2진수로 변환하여 출력한다. 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다.
 *
 * 예제 입력 1
 * 314
 * 예제 출력 1
 * 11001100
 *
 *
 *
 * 8진수 -> 10진수 -> 2진수
 */
public class Number1212 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String oct = sc.nextLine();
        String[] binaryOctArray = {"000", "001", "010", "011", "100", "101", "110", "111"};
        int n = 0;

        if (oct.length() == 1 && oct.charAt(0) == '0') {
            sb.append(0);
        } else {
            n = Character.getNumericValue(oct.charAt(0));
            if (n == 1) {
                sb.append("1");
            } else if (n == 2) {
                sb.append("10");
            } else if (n == 3) {
                sb.append("11");
            } else if (n == 4) {
                sb.append("100");
            } else if (n == 5) {
                sb.append("101");
            } else if (n == 6) {
                sb.append("110");
            } else if (n == 7) {
                sb.append("111");
            }

            for (int i = 1; i < oct.length(); i++) {
                n = Character.getNumericValue(oct.charAt(i));
                sb.append(binaryOctArray[n]);
            }
        }
        System.out.println(sb.toString());
    }
}
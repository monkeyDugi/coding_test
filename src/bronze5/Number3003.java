package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Number3003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> blackPieces = Arrays.asList(1, 1, 2, 2, 2, 8);
        int i = 0;
        int whitePiece = 0;

        while(st.hasMoreTokens()) {
            whitePiece = Integer.parseInt(st.nextToken());
            int blackPiece = blackPieces.get(i++);
            System.out.print(blackPiece - whitePiece + " ");
        }
    }
}

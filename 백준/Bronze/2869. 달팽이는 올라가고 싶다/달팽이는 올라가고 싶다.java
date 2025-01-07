import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입출력을 위해 BufferedReader와 BufferedWriter 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 예시: 한 줄을 읽고 공백 기준으로 나눔
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        // 문제 풀이 코드 작성

        int x = 1 + (V - A + (A - B) - 1) / (A - B);


        int result = x;

        // 출력
        bw.write(String.valueOf(result));
        bw.newLine();

        // 자원 닫기
        br.close();
        bw.flush();
        bw.close();
    }
}

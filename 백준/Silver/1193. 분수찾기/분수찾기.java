import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // N 값 입력

        // 초기화
        int A = 1, B = 1; // A/B
        boolean TP = true; // 전환점 상태 (True: A가 기준, False: B가 기준)

        // N-1번 반복
        for (int i = 1; i < N; i++) {
            if (TP) { // TP가 True인 경우
                if (A == 1) {
                    TP = false; // 전환
                    B++;
                } else {
                    A--;
                    B++;
                }
            } else { // TP가 False인 경우
                if (B == 1) {
                    TP = true; // 전환
                    A++;
                } else {
                    B--;
                    A++;
                }
            }
        }

        // 결과 출력
        System.out.println(A + "/" + B);
    }
}


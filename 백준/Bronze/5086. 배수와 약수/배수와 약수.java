import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입출력을 위해 BufferedReader와 BufferedWriter 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while(true) {
            String result = "neither";
            // 입력 예시: 한 줄을 읽고 공백 기준으로 나눔
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            // 종료 조건 확인
            if (A == 0 && B == 0) {
                break;
            }

            if(A<B) {
                if(B%A == 0) {
                    result = "factor";
                }
            } else{
                if(A%B == 0) {
                    result = "multiple";
                }
            }
            // 출력
            bw.write(result);
            bw.newLine();
        }



        // 자원 닫기
        br.close();
        bw.flush();
        bw.close();
    }
}

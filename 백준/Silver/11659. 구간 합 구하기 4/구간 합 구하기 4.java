

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 첫째 줄에 숫자의 개수 N과 합을 구해야 하는 횟수 M이 공백을 구분으로 주어진다
        StringTokenizer NandM = new StringTokenizer(bf.readLine(), " ");
        int N = Integer.parseInt(NandM.nextToken());
        int M = Integer.parseInt(NandM.nextToken());
        
        // 둘째 줄에 숫자들이 공백을 기준으로 주어진다
        StringTokenizer numStr = new StringTokenizer(bf.readLine(), " ");
        
        // 숫자를 담을 배열을 크기를 정해서 선언한다
        int[] numli = new int[N];
        int[] prefixSum = new int[N + 1];  // 누적 합 배열
        
        // 반복문을 통해 int 배열을 채우고, 누적 합 배열을 계산한다
        for (int i = 0; i < N; i++) { // nextToken 메서드를 이용하면 토큰의 갯수가 줄어들기때문에 반복문 조건식에서 이 문제의 경우 countTokens를 사용해서는 안된다!!
            numli[i] = Integer.parseInt(numStr.nextToken());
            prefixSum[i + 1] = prefixSum[i] + numli[i];
        }

        // 셋째 줄부터는 더할 구간의 범위를 공백을 기준으로 M줄에 걸쳐 주어진다
        for (int i = 0; i < M; i++) {
            // 공백을 기준으로 나누어 슬라이싱 범위를 입력받는다
            StringTokenizer iStr = new StringTokenizer(bf.readLine(), " ");
            int start = Integer.parseInt(iStr.nextToken());
            int end = Integer.parseInt(iStr.nextToken());
            
            // 구간 합 계산 (누적 합 배열을 이용하여 O(1) 시간에 계산)
            int sum = prefixSum[end] - prefixSum[start - 1];
            bw.write(sum + "\n");   // 버퍼에 있는 값 전부 출력
        }
        
        bw.flush();   // 남아있는 데이터를 모두 출력시킴
        bw.close();   // 스트림을 닫음
        bf.close();   // BufferedReader 닫기
    }
}

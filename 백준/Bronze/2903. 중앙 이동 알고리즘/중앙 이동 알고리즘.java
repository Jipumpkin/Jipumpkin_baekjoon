

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        

        // 정사각형의 모음에서 점의 갯수를 반환하는 프로그램
        
        // 초기 4개
        // 1차 9개
        // 2차 25개
        
        // 테스트케이스 N 입력
        int N = Integer.parseInt(bf.readLine());
              
        
        
//        3의제곱
//        5의제곱
//        9의제곱
//        17의 제곱
//        
//        다음수는 *2-1
        
        int num = 3;
        
        
        for(int i = 1; i<N; i++) {
        	
        	num = num*2-1;
        	
        }
        
        System.out.println(num*num);
        	
        	
        	
        	
        
        
        
        
        
        
//        bw.flush();   // 버퍼의 데이터를 모두 출력

        
        bw.close();   // BufferedWriter 닫음
        bf.close();   // BufferedReader 닫기
    }
}

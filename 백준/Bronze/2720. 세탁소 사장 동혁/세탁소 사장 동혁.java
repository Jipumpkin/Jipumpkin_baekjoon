

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
        

        // 거스름돈 동전 갯수 최소화 프로그램
        
        // 쿼터 25센트
        // 다임 10센트
        // 니켈 5센트
        // 페니 1센트
        
        // 테스트케이스 T 입력
        int T = Integer.parseInt(bf.readLine());
        
        int[] result = new int[4];
        
        // 테스트케이스 T번만큼 잔돈 출력
        for(int i = 0; i<T; i++) {
        	
        	int money = Integer.parseInt(bf.readLine());
        	
        	result[0] = money/25;
        	money -= result[0]*25;
        	
        	result[1] = money/10;
        	money -= result[1]*10;
        	
        	result[2] = money/5;
        	money -= result[2]*5;
        	
        	result[3] = money/1;
        	
        	for(int j=0; j<4; j++) {
        		System.out.print(result[j]+" ");
        	}

        	
        	
        	
        	
        	
        	
        	
        }

        
        
        
        
        
//        bw.flush();   // 버퍼의 데이터를 모두 출력

        
        bw.close();   // BufferedWriter 닫음
        bf.close();   // BufferedReader 닫기
    }
}

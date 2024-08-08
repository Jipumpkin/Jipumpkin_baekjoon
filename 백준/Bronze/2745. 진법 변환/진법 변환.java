

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력받기
        String input = bf.readLine();
        
        // 입력 문자열을 공백으로 분리
        String[] inli = input.split(" ");
        
        // 첫 번째 문자열은 n진법 수, 두 번째 문자열은 진법
        String N = inli[0]; 
        int B = Integer.parseInt(inli[1]); // 진법을 정수로 변환
        
        // BigInteger를 사용하여 n진법 문자열을 10진법으로 변환
        BigInteger Dnum = new BigInteger(N, B);
        
        // 결과 출력
        System.out.println(Dnum);
        
        // BufferedReader 닫기
        bf.close();
    }
}

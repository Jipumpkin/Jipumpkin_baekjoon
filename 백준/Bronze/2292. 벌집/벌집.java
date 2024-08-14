
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        

        // 벌집사이의 거리를 구하는 프로그램
        
        // 1을 중심으로 시계방향으로 회전하며 각각의 벌집에 숫자가 채워져있다.
        
        // 원하는 숫자까지의 거리는 1부터 시작하여 한 레이어를 지나는 수이다.
        
        // 원하는 숫자까지의 거리를 구하기 위해서는 그 수가 어떤 레이어에 속해있는지를 구하면 된다.
        
        
        
        
        // 숫자를 입력받는다.
        
        // 레이어 카운트 변수를 선언한다.
        
        // 1부터 입력받는 숫자까지 반복하며 하나의 레이어를 지날때마다 카운트를 증가시킨다.
        
        // 카운트 변수를 출력한다.
        
        //1
        //6
        //12
        //18
        
        // 레이어마다 벌집 수는 6의 배수로 증가한다.
        
        // 1~1  1구간
        // 2~7  2구간
        // 8~19  3구간
        // 20~37  4구간
        // ...
        
        // 6의 배수의 구간에 입력받은 숫자가 어디에 속해있는지 알아내면 된다.
        
        
        // 테스트케이스 N 입력
        int N = Integer.parseInt(bf.readLine());
	
        // 카운트 변수 선언
        int count = 0;
        
        int num = 2;
        
        // 반복문을 통해 N번 반복한다.
        // 지역변수 i가 6*count로 나눈 나머지가 2 가 될때마다 count를 증가시킨다.
        
        if(N>=2) {
        	count++;
        }
        
        for(int i = 2; i<=N; i++) {
        	
        	if(i == num+count*6) {
        		num = num+count*6;
        		count++;
        	}
        	
        }
        
        System.out.println(count+1);
        
        
        // 2	+ 0*6			2
        // 이전값 + 1*6			8
        // 이전값 + 2*6			20
        // 이전값 + 3*6			38
        
        
        
        
//        bw.flush();   // 버퍼의 데이터를 모두 출력

        
        bw.close();   // BufferedWriter 닫음
        bf.close();   // BufferedReader 닫기
    }
}

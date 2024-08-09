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
        
        // 구간 합 구하기 11659번
        
        // 첫재줄에 숫자의 개수 N과 합을 구해야 하는 횟수 M이 공백을 구분으로 주어진다
        StringTokenizer NandM = new StringTokenizer(bf.readLine(), " ");
        
        // 공백을 기준으로 N과 M을 나누고 변수에 저장한다.
        int N = Integer.parseInt(NandM.nextToken());
        int M = Integer.parseInt(NandM.nextToken());
        
        // 둘째줄에 숫자들이 공백을 기준으로 주어진다
        StringTokenizer numStr = new StringTokenizer(bf.readLine(), " ");
        
 
        // 숫자를 담을 배열을 크기를 정해서 선언한다
        int[] numli = new int[N];
        
        
        // 처음 숫자부터 차례로 n번째 구간까지의 합을 저장할 배열을 선언한다.
        int[] sum = new int[N+1];
        
        // 배열의 크기를 N+1로 설정하는 이유
        
        // 1. 반복문으로 sum을 채울때, 두가지 방식으로 채울수 있다.
        // 1-1. 이전 인덱스의 값에 현재 numli[i] 값을 더해 합을 구한다.
        // 1-2. 다음 인덱스(i+1)부터 값을 채워나간다. 현재 인덱스의 값에 numli[i]를 더하는 방식
        // 위 방식을 이용할 경우 반복문이 없는 인덱스를 참조하려는 상황이 생길수 있으므로 배열의 크기를 하나 늘려서
        // 첫 인덱스 또는 끝 인덱스의 값을 0으로 설정하여 사용하려는 방식에 맞게 활용해야한다.
        
        // 2. sum[]을 통해 start부터 end까지의 구간합을 계산하려고 하는데,
        // 	  처음부터 n번째 구간까지의 합을 구하는 과정에서 마지막 구간까지의 합에서 시작 구간의 값을 빼야하는데,
        //	  이때 처음부터 n번째 까지의 합을 구하는 경우에는 값을 빼지 않거나 0을 빼야한다.
        // 	  따라서 배열의 처음 또는 끝값을 0으로 설정해야 시작지점을 설정할수 있게 된다.
        

 
        
        
        // 반복문을 통해 int 리스트를 채운다.
        for(int i = 0; i<N; i++) {
        	numli[i] = Integer.parseInt(numStr.nextToken());
        	// 카운트토큰은 넥스트토큰을 실행하면서 줄어들기때문에 반복문 조건에 넣어선 안된다.
        	sum[i+1] = sum[i] + numli[i];
        }
        
        
//        // sum배열의 첫번째 값은 numli[0]으로 설정한다.
//        // 첫 구간합은 numli[0]의 값과 동일하기 때문이다.
//        sum[0] = numli[0];
        
        // 이 방식은 결국 결과 구간합을 계산하는 과정에서 첫번째 부터 어떤 인덱스까지의 합을 구할때
        // 0을 빼야함으로 sum의 첫번째 인덱스의 값에 0이 존재해야한다. 따라서 실패
        		
        

        
        // 셋째줄부터는 더할 구간의 범위를 공백을 기준으로 M줄에 걸쳐 주어진다.
        for(int i = 0; i<M; i++) {
        	
            // 공백을 기준으로 나누어 슬라이싱 범위를 입력받는다.
        	StringTokenizer iStr = new StringTokenizer(bf.readLine(), " ");
            
            // 숫자로 변환
            int start = Integer.parseInt(iStr.nextToken());
            int end = Integer.parseInt(iStr.nextToken());
            
            int result = sum[end] - sum[start-1];
            
            bw.write(result+"\n");   // 데이터를 버퍼에 저장
            
            
            
        }
        
        bw.flush();   // 버퍼의 데이터를 모두 출력
        // flush를 하면 버퍼의 데이터가 모두 출력되고 버퍼는 비게된다.
        // 이전에는 반복문 안에서 flush를 매번 실행하였지만
        // write는 데이터를 버퍼에 기록하는것으로, 반복문이 끝나고 flush 한번이면 
        // 모든 데이터가 출력되기때문에 flush의 실행을 최소화하기위해 반복문 바깥으로 뺀다.
        // 반복문 안에 있을시에 매번 I/O 연산이 늘어나므로 시간복잡도에 영향을 미친다.
        
        bw.close();   //스트림을 닫음
        // BufferedReader 닫기
        bf.close();
    }
}

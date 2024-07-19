
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//9행 9열의 배열값이 9줄에 걸쳐 공백을 기준으로 입력된다
		
		// 첫째줄에 최댓값을 출력하고 
		// 둘째줄에 최댓값의 행번호와 열번호를 공백을 기준으로 출력한다.
		
		
		
		
		
		
		
		int[][] sibal = new int[9][9];
		
		for(int i=0; i<9; i++) {
			String[] oneline = sc.nextLine().split(" ");
			for(int j=0; j<9; j++) {
				sibal[i][j] = Integer.parseInt(oneline[j]);
			}
		}
		// 배열 입력받음
		
		int max = sibal[0][0];
		int x=1;
		int y=1;
		for(int i=0; i<9; i++) {
			
			for(int j=0; j<9; j++) {
				
				if(sibal[i][j] > max) {
					max = sibal[i][j];
					x = i+1;
					y = j+1;
				}
			}
		}
		
		// 최댓값과 행렬 찾기
		
		System.out.println(max);
		System.out.println(x+" "+y);
		
		
		

		
		

	}

}
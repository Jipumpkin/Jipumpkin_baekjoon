

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 숫자 N M이 주어진다 이는 행렬의 크기이다
		// 행렬에 대한 정보를 2번째 줄부터 입력한다. 
		// 행렬은 총 두개
		
		// N개 줄에 M개의 원소가 주어진다 총 두번.
		
		// 크기가 같은 두 행렬을 더해서 출력하면 된다.
		
		
		String[] input = sc.nextLine().split(" ");
		
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		
		
		int[][] sibal = new int[N][M];
		
		for(int i=0; i<N; i++) {
			String[] oneline = sc.nextLine().split(" ");
			for(int j=0; j<M; j++) {
				sibal[i][j] = Integer.parseInt(oneline[j]);
			}
		}
		
		int[][] sibal2 = new int[N][M];
		
		for(int i=0; i<N; i++) {
			String[] oneline = sc.nextLine().split(" ");
			for(int j=0; j<M; j++) {
				sibal2[i][j] = Integer.parseInt(oneline[j]);
			}
		}
		
		
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				sibal[i][j] += sibal2[i][j]; 
				System.out.print(sibal[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
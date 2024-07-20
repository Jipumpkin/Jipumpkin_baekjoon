

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] wordList = new String[5];
		
		
		
		for(int i=0; i<5; i++) {
			String input = sc.nextLine();
			wordList[i] = input;
			
		}
		// 5줄 입력받아 스트링 배열에 저장
		
		// 배열에 저장된 문자열의 같은 인덱스의 문자를 차레대로 출력
		
		// 문자열에 해당 인덱스가 없을경우 패스
		
		
		for (int i = 0; i < 15; i++) {
		    for (int j = 0; j < 5; j++) {
		        // 문자열의 길이가 j보다 큰지 확인
		        if (i < wordList[j].length()) {
		            if (!(wordList[j].charAt(i) + "").equals(" ")) {
		                System.out.print(wordList[j].charAt(i));
		            }
		        }
		    }
		}
		
		
		


		
		

	}

}
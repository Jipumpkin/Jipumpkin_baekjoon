

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		
		// 그룹단어의 갯수를 추출하는 알고리즘
		// 테스트케이스의 수 T가 주어지고
		// T의 수만큼 영단어가 엔터를 기준으로 입력되다
		
		// 그룹단어란 단어의 모든 알파벳이 종류별로 서로 떨어지지않고 붙어있는 단어를 뜻한다. abc aabbcc, kin 등등
		
		// 출력은 테스트케이스의 단어들중 중복단어인 갯수를 출력한다.
		
		
		// 그룹단어인지 아닌지를 판단하면 된다
		
		// 검증방법
		
		// 비그룹단어의 특징을 알면 된다
		
		// 포함된 아무 문자열의 인덱스가 연속되지 않은 순간 단어는 비그룹단어가 된다.
		
		// 각 문자열 종류의 인덱스값을 저장하는 어레이리스트를 생성한다.
		
		// 연속성을 검사하는 방법?
		// 리스트의 어떤 요소가 이전 요소에 1을 더한 결과이면 된다
		
		// 반복문으로 이를 검사하고 탈출했을때 boolean이 True로 유지되면  카운트 변수를 증가시킨다.
		
		int T = sc.nextInt(); // 테스트케이스 입력
		sc.nextLine(); // 개행 문자 처리
		int count = 0; // 그룹단어의 수
		
		for(int tt=0; tt<T; tt++) {
			// 시작
			String word = sc.nextLine();
			
			// 문자열에 알파벳 종류를 담을 어레이리스트를 생성
			ArrayList<String> alpaList = new ArrayList<>();
			
			
			
			for(char i : word.toCharArray()) {
				String str = String.valueOf(i);
				if(!alpaList.contains(str)) {
					alpaList.add(str);
				}
			}
			
			// 알파벳 종류를 담은 어레이리스트가 생성됨
			
			// 어레이리스트를 순회하는 반복문 생성
			// i값이 word에서 가지는 인덱스들을 담는 2차반복문 생성
			// 해당 인덱스들을 담는 어레이리스트가 연속성을 가지는지를 검사
			
			
			// 단어가 그룹단어인지 판별할 변수
			boolean isGroup = true;
			for(String i : alpaList) {
				
				if(word.length()==1) {
					break;
				} // 예외처리 : 문자열 길이가 1이면 반복문 탈출
				
				
				
				boolean isCon = true;
				// 각 문자열이 그룹화되어있는지 판별할 변수
				
				ArrayList<Integer> Windex = new ArrayList<>();
				// 문자열의 인덱스값들을 순차적으로 저장할 어레이리스트
				
				for(int j=0; j<word.length(); j++) {
					if(i.equals(String.valueOf(word.charAt(j)))) { // 인덱싱한 문자열이 i와 같다면
						Windex.add(j); // 윈덱스에 j를 추가
					}
				} // 탈출시 윈덱스 완성
				
				// 윈덱스가 연속성을 가지는 리스트인지 판별
				for(int j=1; j<Windex.size(); j++) {
		            if (Windex.get(j) != Windex.get(j - 1) + 1) {
		            	isCon = false;
		            	break;
		            }
				}
				// 반복문 탈출했을때 isCon이 true이면 문자 i는 word 내에서 연속성을 가지는 알파벳임을 의미
				if(!isCon) {
					isGroup = false;
					break;
				}
			}
			// 반복문 탈출시 isGroup이 true로 유지되어있다면 word는 그룹단어인것임
			if(isGroup) {
				count++;
			}
		}

		
		System.out.println(count);


	}

}
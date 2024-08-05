

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 도화지에 색종이를 붙이고 색종이가 차지하는 면적을 구하는 문제
        
        // 크기가 100x100인 도화지
        boolean[][] paper = new boolean[100][100];
        
        // 테스트케이스 t 입력
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        // t개만큼 색종이의 좌측 하단 좌표 입력
        for (int i = 0; i < T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            // 해당 좌표로부터 xy축 10칸씩의 넓이를 도화지에 표시
            for (int dx = 0; dx < 10; dx++) {
                for (int dy = 0; dy < 10; dy++) {
                    paper[x + dx][y + dy] = true;
                }
            }
        }
        
        // 색종이가 차지하는 면적 계산
        int area = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j]) {
                    area++;
                }
            }
        }
        
        // 결과 출력
        System.out.println(area);
        
        sc.close();
    }
}

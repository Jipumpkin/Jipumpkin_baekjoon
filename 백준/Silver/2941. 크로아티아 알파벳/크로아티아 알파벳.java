import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int Wcount = word.length();

        // 크로아티아 알파벳 배열
        String[] croa = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        // 크로아티아 알파벳 개수를 카운트할 변수
        int croCount = 0;

        // 입력된 문자열을 순회하며 크로아티아 알파벳을 찾아내고
        // 공백으로 대체함
        // ""로 대체하지 않은 이유는 문자 사이를 일부러 구분하여서
        // 중복패턴이 발생하는것을 막기 위함
        for (String cro : croa) {
            while (word.contains(cro)) {
                word = word.replaceFirst(cro, " ");
                croCount++;
            }
        }

        // 남은 문자중 공백을 제거하고 단일 알파벳으로 취급하여 갯수를 셈
        word = word.replaceAll(" ", "");
        Wcount = croCount + word.length();

        System.out.println(Wcount);

        sc.close();
    }
}
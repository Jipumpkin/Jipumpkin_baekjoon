

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
      
        // 입력받은 문자열의 요소들을 분해해서 어레이리스트에 담는다
        // 어레이리스트의 요소들을 toupper case로 대문자변환
        // 또다른 어레이리스트를 생성해서 기존 어레이리스트의 요소들을 조건문으로 확인하여 넣는다
        // 출력한다
      
        ArrayList<String> AList = new ArrayList<>();
        ArrayList<String> UniqList = new ArrayList<>();
        ArrayList<Integer> CountList = new ArrayList<>();
      
        for(int i = 0; i < word.length(); i++) {
            String worda = (word.charAt(i) + "").toUpperCase();
            AList.add(worda);
        }
      
        for(String i : AList) {
            if(!UniqList.contains(i)) {
                UniqList.add(i);
                CountList.add(1);
            } else {
                int newVal = CountList.get(UniqList.indexOf(i)) + 1;
                CountList.set(UniqList.indexOf(i), newVal);
            }
        }
      
        int max = 0;
        boolean uniq = false;
        String mostFrequent = "";

        for(int i = 0; i < CountList.size(); i++) {
            if(CountList.get(i) > max) {
                max = CountList.get(i);
                mostFrequent = UniqList.get(i);
                uniq = true;
            } else if(CountList.get(i) == max) {
                uniq = false;
            }
        }

        if(!uniq) {
            System.out.println("?");
        } else {
            System.out.println(mostFrequent);
        }
    }
}

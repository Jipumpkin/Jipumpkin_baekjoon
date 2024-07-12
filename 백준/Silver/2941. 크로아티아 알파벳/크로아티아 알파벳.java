import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int Wcount = word.length();

        
        String[] croa = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        
        int croCount = 0;

        
        for (String cro : croa) {
            while (word.contains(cro)) {
                word = word.replaceFirst(cro, " ");
                croCount++;
            }
        }

        
        word = word.replaceAll(" ", "");
        Wcount = croCount + word.length();

        System.out.println(Wcount);

        sc.close();
    }
}

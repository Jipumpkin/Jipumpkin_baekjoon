

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int snum = sc.nextInt();
		
		for(int i=0; i<snum-1; i++) {
			
			String star = "";
			for(int l=0; l<snum-i-1; l++) {
				star+=" ";
			}
			
			for(int l=0; l<2*i+1; l++) {
				star+="*";
			}
			
//			for(int l=0; l<snum-i-1; l++) {
//				star+=" ";
//			}
			
			System.out.println(star);
		}
		
		String star = "";
		for(int i=0; i<snum*2-1; i++) {
			star+="*";
		}
		System.out.println(star);
		
		
		
		
		
		for(int i=snum; i>1; i--) {
			

			
			String star1 = "";
			for(int l=0; l<snum-i+1; l++) {
				star1+=" ";
			}
			
			
			for(int l=0; l<i*2-3; l++) {
				star1+="*";
			}
			
//			for(int l=0; l<snum-i+1; l++) {
//				star1+=" ";
//			}
			
			System.out.println(star1);
		}
		


	}

}
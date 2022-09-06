package test1152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		sc.close();
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		
		if((str.charAt(str.length() - 1) == ' ') && (str.charAt(0) == ' ')) {
			System.out.println(count - 1);
		} else if((str.charAt(str.length() - 1) == ' ') || (str.charAt(0) == ' ')) {
			System.out.println(count);
		} else {
			System.out.println(count + 1);
		}
	}

}

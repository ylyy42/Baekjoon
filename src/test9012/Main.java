package test9012;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		
		while(T-- > 0) {
			String s = sc.next();
			System.out.println(print(s));
		}
		sc.close();
	}

	static String print(String s) {
		int count = 0;

		for(char c : s.toCharArray()) {
			if(c == '(') {
				count++;
			} else if(count == 0) {
				return "NO";
			} else if(c == ')') {
				count--;
			}
		}
		
		if(count == 0) {
			return "YES";
		} else {
			return "NO";
		}
	}
}

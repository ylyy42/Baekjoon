package test8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int score = 0;
		int result = 0;
		String ox;

		while (num-- > 0) {
			ox = sc.next();
			String[] ch = ox.toUpperCase().split("");

			for (int j = 0; j < ch.length; j++) {
//				System.out.println(ch[j]);
				if (ch[j].equals("O")) {
					score++;
				} else {
					score = 0;
				}
				result += score;
			}
			System.out.println(result);
			score = 0;
			result = 0;
		} 
		
		
		sc.close();

	}

}

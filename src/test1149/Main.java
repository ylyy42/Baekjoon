package test1149;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int red = 0;
		int green = 1;
		int blue = 2;
		int[][] homeArr = new int[num][3];
		int result = 0;

		for (int i = 0; i < num; i++) {
			homeArr[i][red] = sc.nextInt();
			homeArr[i][green] = sc.nextInt();
			homeArr[i][blue] = sc.nextInt();
		}
		sc.close();

		for (int i = 1; i < num; i++) {
			homeArr[i][red] += Math.min(homeArr[i - 1][green], homeArr[i - 1][blue]);
			homeArr[i][green] += Math.min(homeArr[i - 1][red], homeArr[i - 1][blue]);
			homeArr[i][blue] += Math.min(homeArr[i - 1][green], homeArr[i - 1][red]);
		}
		
		result = Math.min(Math.min(homeArr[num - 1][red], homeArr[num - 1][green]), homeArr[num - 1][blue]);

		System.out.println(result);
	}

}

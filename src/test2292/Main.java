package test2292;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int count = 1; //거리
		int range = 2; //범위(같은 count의 최솟값, 1은 count가1이다 그러니 2부터다.)
		
		if(num == 1) {
			System.out.println(1);
		} else {
			while(range <= num) {
				range = range + (6 * count);
				count++;
			}
			System.out.println(count);
		}
		
	}
}

package test2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numA = sc.nextInt();
		int numB = sc.nextInt();
		sc.close();
		
		System.out.println(numA * (numB % 10));
		System.out.println(numA * ((numB % 100) / 10));
		System.out.println(numA * (numB / 100));
		System.out.println(numA * numB);
	}

}

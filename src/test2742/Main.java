package test2742;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		if(num > 0 && num <= 1000000) {
			for(int i = num; i >= 1; i--) {
				System.out.println(i);
			}
		} else {
			System.out.println("���� �߸��Ǿ����ϴ�.");
		}

	}

}

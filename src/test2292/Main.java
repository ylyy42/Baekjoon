package test2292;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int count = 1; //�Ÿ�
		int range = 2; //����(���� count�� �ּڰ�, 1�� count��1�̴� �׷��� 2���ʹ�.)
		
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

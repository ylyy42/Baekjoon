package test1193;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int top;
		int bottom;
		
		sc.close();
		
		int sum; // �ش� �ε��� �ٱ����� �м��� ����
		int index = 1; // ���°������
		
		while(true) {
			sum = index * (index + 1) / 2; // n��° ������ ���� ���ϴ� �� n(n+1)/2
			if(num <= sum) {
				break;
			}
			index++;
		}
		
		// ���ٿ��� ���° ������(�������� num ��°���� �����ε��� �ٱ����� �м������� ���ش�
		int result = num - (index - 1) * (index) / 2; 
		
		if(index % 2 == 0) { // ¦����° ���϶��� ������ ������
			// ���ڴ� 1���� index������ 1�� ����
			top = result;
			// �и�� index������ 1���� 1�� �پ��
			bottom = index - result + 1;
		} else {
			top = index - result + 1;
			bottom = result; 
		}
		
//		System.out.printf("%d/%d",top,bottom);
		System.out.println(top + "/" + bottom);
	}
}

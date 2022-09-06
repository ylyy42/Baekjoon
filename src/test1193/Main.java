package test1193;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int top;
		int bottom;
		
		sc.close();
		
		int sum; // 해당 인덱스 줄까지의 분수의 갯수
		int index = 1; // 몇번째줄인지
		
		while(true) {
			sum = index * (index + 1) / 2; // n번째 까지의 합을 구하는 식 n(n+1)/2
			if(num <= sum) {
				break;
			}
			index++;
		}
		
		// 그줄에서 몇번째 값인지(내가적은 num 번째에서 그전인덱스 줄까지의 분수갯수를 빼준다
		int result = num - (index - 1) * (index) / 2; 
		
		if(index % 2 == 0) { // 짝수번째 줄일때는 방향이 역방향
			// 분자는 1부터 index값까지 1씩 증가
			top = result;
			// 분모는 index값에서 1까지 1씩 줄어듬
			bottom = index - result + 1;
		} else {
			top = index - result + 1;
			bottom = result; 
		}
		
//		System.out.printf("%d/%d",top,bottom);
		System.out.println(top + "/" + bottom);
	}
}

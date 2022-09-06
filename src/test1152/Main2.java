package test1152;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		sc.close();
		
		String[] arr = str.trim().split(" ");
		
		if(str.trim().isEmpty() == true) {
			System.out.println(0);
		} else {
			
			System.out.println(arr.length);
		}
		
	}

}

package test3040;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int[] members = new int[9];

		for(int i = 0; i < members.length; i++) {
			num = sc.nextInt();
			members[i] = num;
		}
		sc.close();

		print(members);
	}

	static void print(int[] members) {
		int sum = 0;
		int notnum = 0;
		int not1 = 0;
		int not2 = 0;
		int[] realMembers = new int[7];
		int start = 0;

		for(int i = 0; i < members.length; i++) {
			sum += members[i];
		}

		notnum = sum - 100;

		for(int i = 0; i < members.length; i++) {
			for(int j = 1; j < members.length; j++) {
				if(i != j) {
					if(members[i] + members[j] == notnum) {
						not1 = members[i];
						not2 = members[j];
					}
				}
			}
		}

		for(int i = 0; i < members.length; i++) {
			if(members[i] != not1) {
				if(members[i] != not2) {
					realMembers[start] = members[i];
					System.out.println(realMembers[start]);
					start++;
				}
			}
		}

	}

}
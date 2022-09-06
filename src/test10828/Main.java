package test10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		MyStack msk = new MyStack();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		if (N > 0 && N <= 10000) {
			while (N > 0) {
				String[] input = br.readLine().split(" ");

				switch (input[0]) {
				case "push":
					int number = Integer.parseInt(input[1]);
					if (number > 0 && number <= 100000) {
						msk.push(number);
						N--;
					} else {
						System.out.println("정수값은 1이상 100000이하입니다.");
					}
					break;
				case "pop":
					msk.pop();
					N--;
					break;
				case "size":
					msk.size();
					N--;
					break;
				case "empty":
					msk.empty();
					N--;
					break;
				case "top":
					msk.top();
					N--;
					break;
				}
			}
		}

	}
}

class MyStack {

	private List<Integer> intarr = new ArrayList<Integer>();

	void push(int i) {
		intarr.add(0, i);
	}

	void pop() {
		if (!(intarr.isEmpty())) {
			int a = intarr.get(0);
			intarr.remove(0);

			System.out.println(a);
		} else {
			System.out.println(-1);
		}
	}

	void size() {
		System.out.println(intarr.size());
	}

	void empty() {
		if (intarr.isEmpty()) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	void top() {
		if (intarr.isEmpty()) {
			System.out.println(-1);
		} else {
			int t = intarr.get(0);
			System.out.println(t);
		}
	}

}
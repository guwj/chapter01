package chapter01;

import java.util.Scanner;

public class Day02PowerOfTwo01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int result = 1;
		System.out.print("승수 : ");

		int pow = scanner.nextInt();

		// Q. 아래 while 반복문을작성하시오

		int i = 0;
		while (i < pow) {
			result = result * 2;
			i++;
		}
		System.out.println("2의 " + pow + "제곱은 " + result + "입니다");
	}

}

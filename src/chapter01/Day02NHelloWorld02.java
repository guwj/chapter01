package chapter01;

import java.util.Scanner;

public class Day02NHelloWorld02 {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("횟수를 입력하세요 : ");
			int count = scanner.nextInt();
			
			for(int i = 0 ; i < count ; i++){
				System.out.println("Hello World");
			}
			
			scanner.close();
		}
	}



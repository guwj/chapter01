package chapter01;

import java.util.Scanner;

public class Day02SumToInput {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);  
		  System.out.print("값을 입력하세요 : ");
		  int n = scanner.nextInt();
		  
		  int sum = 0;
		  
		  for(int i = 0 ; i <= n ; i++){
			  sum = sum + i;
		  }
		  System.out.println(sum + "입니다");
		  
		  scanner.close();
	}
}

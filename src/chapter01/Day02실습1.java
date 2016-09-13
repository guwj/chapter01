package chapter01;

public class Day02실습1 {

	public static void main(String[] args) {
		// Q. n1값이 항상 큰 값이 되도록, 필요할 경우 n1과 n2를 교체하라
		int n1 = 50;
		int n2 = 50;
		

		if (n1 < n2) {
			int n3 = 0;
			n3 = n1;
			n1 = n2;
			n2 = n3;
		}

		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);

		// Q. 최대값을 판별하는 조건을 완성하라
		int a1 = 10;
		int a2 = 20;
		int a3 = 20;

		if (a1 >= a2 && a1 >= a3) {
			System.out.println("최대값은 " + a1 + "입니다");
		} else if (a2 >= a1 && a2 >= a3) {
			System.out.println("최대값은 " + a2 + "입니다");
		} else if (a3 >= a1 && a3 >= a2) {
			System.out.println("최대값은 " + a3 + "입니다");
		}

	}
}

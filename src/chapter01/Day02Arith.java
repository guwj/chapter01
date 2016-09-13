package chapter01;

public class Day02Arith {

	public static void main(String[] args) {

		int a = 7;
		int b = 3;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		a = a+1;
		System.out.println(a);
		
		a += 1;
		System.out.println(a);
		
		a++;
		System.out.println(a);
		
		++a;
		System.out.println(a);
		
		System.out.println(a++);
		//System.out.println(a);을 실행하고 a++;를 실행한 것과 같다
		
		System.out.println(++a);
		//++a;를 실행하고 System.out.println(a);를 실행한 것과 같다
		
		//나누기 연산
		System.out.println(10/3);
		System.out.println(10.0/3.0);
		System.out.println(10.0/3);
		
		System.out.println((double)10 / 3);
		System.out.println((double)(10 / 3));
		
		//나머지 연산
		System.out.println( 44 % 3 );
		System.out.println( -7 % 3 );	// 계산에 음수가 들어가면 몫은 나눔당하는 값에 가까운 수가 된다 
		System.out.println( 7 % -3 );	
	}

}

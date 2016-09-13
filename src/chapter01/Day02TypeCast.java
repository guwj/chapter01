package chapter01;

public class Day02TypeCast {

	public static void main(String[] args) {
		
		//implicity(암시적) typecasting
		int i = 10;
		long l = i;
		System.out.println(i + ":" + l);
		
		
		//explicity(명시적) typecasting -> 8바이트의 long형 변수가 4바이트의 int형 변수로 들어가므로 원래 에러가 나는데 컴파일러에게 괜찮다고 명시 해주는 것
		long l2 = 123456789;
		int i2 = (int)l2;
		System.out.println(i2 + ":" + l2);
		
	
	}

}

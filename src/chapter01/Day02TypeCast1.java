package chapter01;

public class Day02TypeCast1 {

	public static void main(String[] args) {
		byte b = 25;
		short s = b;
		int i = s;
		long l = i;
		float f = i;
		double d = f;
		
		// byte b1 = 256;  byte는 -127~128의 수를 담을 수 있기 때문에 (byte)해줘서 강제로 넣어야 한다
		
		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		
		System.out.println("f = " + f);
		System.out.println("d = " + d);
	
	}

}

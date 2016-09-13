package chapter01;

public class Day02Student {
		int number;	//학번이 0144621일 경우 int로 하면 144621이 되기 때문에 String으로 해야한다
		String name;
		boolean isEnrolled;
		double grade;	// 긴 수가 아니므로 float이 메모리 저장
		String address;
		String major;
		int unit;
		boolean haveMinor;
		int juminNO; // 큰 수이기 때문에 long으로 받거나 또는 1 or 2에 의해 성별을 파악하는 등의 기능이 있으므로 s.charAt(6)과 같은 함수 쓰려고 String을 사용
		String cellphone;
		int age;
		String email;

	}

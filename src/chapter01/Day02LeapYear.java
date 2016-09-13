package chapter01;

public class Day02LeapYear {

	public static void main(String[] args) {
		int year = 400;
		
		if( year % 4 != 0){
			System.out.println("윤년이 아닙니다");
		}else if(year % 100 != 0){
			System.out.println("4로 나누어 떨어지고 100으로 나누어 떨어지지 않는다");
		}else if( year % 400 != 0){
			System.out.println("윤년이 아닙니다");
		}else{
			System.out.println("윤년입니다");
		}
	}

}

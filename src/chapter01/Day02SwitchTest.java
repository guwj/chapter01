package chapter01;

public class Day02SwitchTest {

	public static void main(String[] args) {
		char month = 'a';
		int days = 0;
				
		/* ||를 사용하여 줄일수 있다
		if( month == 1) {
			days = 31;
		}else if( month == 2){
			days = 28;
		}else if( month == 3){
			days = 31;
		}else if( month == 4){
			days = 30;
		}else if( month == 5){
			days = 31;
		}else if( month == 6){
			days = 30;
		}else if( month == 7){
			days = 31;
		}else if( month == 8){
			days = 31;
		}else if( month == 9){
			days = 30;
		}else if( month == 10){
			days = 31;
		}else if( month == 11){
			days = 30;
		}else if( month == 12){
			days = 31;
		}*/
		
		
		switch( month ){
			case 'a' : days = 30;
			case 2 : days = 28;
			case 3 : days = 30;
			case 4 : days = 30;
			case 5 : days = 30;
			case 6 : days = 30;
			case 7 : days = 30;
			case 8 : days = 30;
			
		}
		
		
		System.out.println( month + "월은 " + days + "일 까지 있습니다");
	}

}

package chapter01;

public class Day02ContinueTest {

	public static void main(String[] args) {
		for(int i = 0 ; i <= 20 ; i++){
			if(i%2 != 0 && i%3 != 0){
				System.out.println(i);
			}
		}
		
		
		// 강사님이 짠 코드 -> 가독성이 좋다
		for(int i = 0 ; i <= 20 ; i++){
			if(i%2 ==0){
				continue;
			}
			
			if(i%3 ==0){
				continue;
			}
			System.out.println(i);
			
		}
		
		
		
	}

}

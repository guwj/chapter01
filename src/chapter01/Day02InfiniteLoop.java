package chapter01;

public class Day02InfiniteLoop {

	public static void main(String[] args) {
		
//		for( ; ; ){		무한루프
//			
//		}
		
		int i = 0;
		int sum = 0;
		
		while( true ){
			i++;
			if(i > 1000){
				break;
			}
			sum = sum + i;
		}
		System.out.println( sum );
	}
}

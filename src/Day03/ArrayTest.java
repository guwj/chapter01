package Day03;

public class ArrayTest {

	public static void main(String[] args) {

		int[] scores = new int[5];
		
		scores[0] = 10;
		scores[1] = 20;
		scores[2] = 30;
		scores[3] = 40;
		scores[4] = 50;
		
		//scores[5] = 60; -> 4까지 밖에 없으므로 error
		
		int sum = 0;
		int size = scores.length;
		for(int i = 0; i < size ; i++){
			sum = sum + scores[i];
		}
		System.out.println("sum : " + sum);
		System.out.println("size : " + size);
	}

}

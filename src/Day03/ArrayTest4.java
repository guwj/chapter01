package Day03;

public class ArrayTest4 {

	public static void main(String[] args) {
		
		int[] intArray;
		intArray = new int[5]; 
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;

		int result = 0;
		for ( int i =0; i < intArray.length; i++ ){
			System.out.println(i + ":" + intArray[i]);
		     result = result + intArray[i];
		}
		System.out.println("result : " + result);
		
		// 확장 for -> i에 1, 2, 3 등 순서가 들어가는게 아니고 intArray[0],intArray[1] 등의 값이 순서에 맞춰 자동으로 들어간다 (적극 추천)
		result = 0;
		for(int i : intArray){
			System.out.println(i);
		     result = result + i;
		}
		System.out.println("result : " + result);
		
	

	}

}

package Day03;

public class ArrayTest3 {

	public static void main(String[] args) {
		//두 방법 모두 가능하나 arrayInt1의 방법을 추천
		int[] arrayInt1; // 추천
		int arrayInt2[]; // 비추천
		//int [10] arrayInt3; -> 자바에서 객체는 무조건 new를 통해 생성하므로 이 것은 오류다
		
		arrayInt1 = new int[5];
		arrayInt1[0] = 1;
		arrayInt1[1] = 1;
		arrayInt1[2] = 1;
		arrayInt1[3] = 1;
		arrayInt1[4] = 1; // 이렇게 해도 틀린 것은 아니지만 생성과 동시에 초기화해주면 편하고 보기 좋다
		
		int[] arrayInt4 = {1, 2, 3, 4, 5};
		
		Book[] books = { new Book(), new Book()}; // 이런 것도 가능
		
		String[] month = {"Jan", "Feb","Mar","Apr","May"};
		
		int[] arrayInt5 = new int[] {10, 20, 30, 40}; // 가능하나 arrayInt4처럼 하는걸 추천
		
//		int[] arrayInt6;
//		arrayInt6 = {100, 200, 300, 400}; -> 선언 이후 이런식으로 초기화 하는 것은 오류 
		
	}

}

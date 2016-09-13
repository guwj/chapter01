package Day03;

public class ArrayTest2 {

	public static void main(String[] args) {
// 객체를 배열로 저장하는 방법 VS 기본type을 배열로 저장하는 방법
		Book[] books = new Book[5];
		books[0] = new Book();
		books[0].title = "자바의 정석";
		
		System.out.println(books[0]);
	
	}

}

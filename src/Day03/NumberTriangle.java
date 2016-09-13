package Day03;

public class NumberTriangle {

	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("정수값을 입력하세요");
			return;
		}
		
		System.out.println( args[0]);
		int count = Integer.parseInt(args[0]); //String형인 args[0]을 int형으로 바꿔서 출력
		System.out.println( count);
		
		for(int i = 1 ; i <= count; i++){
			//System.out.println(i);
			for(int j = 1; j <= i ; j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}

}

package Day03;

public class Echo {
//run as -> run configuration -> argument에서 입력하면 출력됨, String[] args는 옵션을 불러오는 역할
	public static void main(String[] args) {
		System.out.println(args.length);
		for(String s : args) {
			System.out.println(s);
		}
	}

}

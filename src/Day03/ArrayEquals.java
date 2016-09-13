package Day03;

public class ArrayEquals {

	public static void main(String[] args) {
		int[] a1 = {10, 20, 30};
		int[] b1 = {10, 20, 30};
		int[] c1 = null;
		
		boolean result = equals(a1, b1);
		System.out.println(result);
	}
	
	public static boolean equals(int[] a, int[] b){
		if(a == null){	// a 배열이 빈 배열인지 값이 있는 배열인지 검사
			return false;
		}
		if(b == null){	// b 배열이 빈 배열인지 값이 있는 배열인지 검사
			return false;
		}
		
		if(a.length != b.length){	//두 배열이 똑같은 구조의 배열임을 검사
			return false;
		}
		
		int length = a.length;
		for(int i = 0 ; i <length; i++){
			if(a[i] != b[i]){
				return false;
			}
			
		}
		return true;
	}

}

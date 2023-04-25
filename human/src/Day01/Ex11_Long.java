package Day01;

public class Ex11_Long {
	public static void main(String[] args) {
		// int (4byte : 32bits) : 2^32 개 : 42억 개
		// int 수 표현 범위 : -21xxx ~ 21억xxx
		
		// long (8byte :64bits) : 2^64 개
		long In1 = 1000;			// (long) = (int)
		long In2 = 2100000000;		// (long) = (int)
		// long 타입 리터럴 : 숫자L
		long In3 = 2200000000L;		// (long) = (int)
		
		int max = Integer.MAX_VALUE;	// int 형의 최댓값 (21억xxx)
		int min = Integer.MIN_VALUE;	// int 형의 최솟값 (-21억xxx)
		
		System.out.println("int의 최댓값 : " + max);
		System.out.println("int의 최솟값 : " + min);
		
		System.out.println("in1 : " + In1);
		System.out.println("in2 : " + In2);
		System.out.println("in3 : " + In3);
		
	}
}

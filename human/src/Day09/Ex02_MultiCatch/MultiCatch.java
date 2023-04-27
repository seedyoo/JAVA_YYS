package Day09.Ex02_MultiCatch;

import java.util.Scanner;

public class MultiCatch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 자리 수인 정수 2개를 입력해주세요");
		
		try {
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			
			char[] char1 = str1.toCharArray();	// String -> char[] 변환
			char[] char2 = str2.toCharArray();	// "10" -> [1][0]
			
			String[] input1 = new String[char1.length];
			String[] input2 = new String[char2.length];
			
			// char1  --> ['1']['0']
			// input1 --> ["1"]["0"]
			for (int i = 0; i < char1.length; i++) {
				input1[i] = char1[i] + "";
			}
			for (int j = 0; j < input2.length; j++) {
				input2[j] = char2[j] + "";
			}
			System.out.println(input1[0] + input1[1]);	// "10"
			System.out.println(input2[0] + input2[1]);	// "20"
			
			int valu1 = Integer.parseInt(str1);
			int valu2 = Integer.parseInt(str2);
			int result = valu1 + valu2;
			
			System.out.println(str1 + " + " + str2 + " = " + result);
			
		} 
		// 멀티 catch
		// : 하나의 catch 블록에서 처리하고 싶은 예외는 | 기호로 연결하여 사용한다
		catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.err.println("접근할 수 없는 배열 index 범위입니다");
			System.err.println("숫자로 변환할 수 없는 값입니다");
		}
		// 다중 catch
		// : 여러 예외를 각각 다른 catch 블록으로 처리하는것
		// * 상위 예외클래스가 하위 예외 클래스보다 아래쪽에 위치해야한다.
		catch (Exception e) {
			System.err.println("이 외의 알 수 없는 예외 발생");
		}
	
		sc.close();
	}
	
}

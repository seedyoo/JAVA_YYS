package JavaMission;

import java.util.Scanner;

public class _6Lotto {

	public static void main(String[] args) {
		System.out.print("몇 개임? ");
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		
		
		
		for (int i = 0; i < 6; i++) {
			int random = (int) (Math.random() * 45 +1);
			System.out.print(random + " ");
		}
		
		
		sc.close();
		
	}
}

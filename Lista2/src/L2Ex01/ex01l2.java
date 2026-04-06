package L2Ex01;

import java.util.Scanner;

public class ex01l2 {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Me fale n1: ");
		int n1 = scanner.nextInt();
		
		System.out.println("Me fale n2: ");
		int n2 = scanner.nextInt();
		
		System.out.println("Me fale n3: ");
		int n3 = scanner.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("n1 é maior");
		}
		
		else if (n2 > n3) {
			System.out.println("n2 é maior");
		}
		
		else {
			System.out.println("n3 é maior");
		}
	}
}

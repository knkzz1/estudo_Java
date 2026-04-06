package L1Ex04;

import java.util.Scanner;

public class ex04l1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Me fale o n1: ");
		int n1 = scanner.nextInt();
		
		System.out.println("Me fale o n2: ");
		int n2 = scanner.nextInt();
		
		System.out.println("Me fale o n3: ");
		int n3 = scanner.nextInt();
		
		System.out.println("Me fale o n4: ");
		int n4 = scanner.nextInt();
		
		int media = (n1+n2+n3+n4) / 4;
		
		System.out.println("A media desses quatro numeros é: " + media);
	}

}

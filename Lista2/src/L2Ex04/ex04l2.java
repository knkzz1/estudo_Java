package L2Ex04;

import java.util.Scanner;

public class ex04l2 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Me fale um número aleatório eu vou checar se é par ou ímpar");
		int num = scanner.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Este número é par");
		}
		
		else {
			System.out.println("Este número é ímpar");
		}
		
		scanner.close();
	}
}
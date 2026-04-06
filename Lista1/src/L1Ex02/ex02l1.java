package L1Ex02;

import java.util.Scanner;

public class ex02l1 {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Me fale a quantidade do produto 1: ");
	int quantidade1 = scanner.nextInt();
	
	System.out.println("Agora me fale o valor do produto 1: ");
	int valor1 = scanner.nextInt();
	
	
	System.out.println("Me fale a quantidade do produto 2: ");
	int quantidade2 = scanner.nextInt();
	
	System.out.println("Agora me fale o valor do produto 2: ");
	int valor2 = scanner.nextInt();
	
	int resultado = (quantidade1 * valor1) + (quantidade2 * valor2);
	
			
	System.out.println("O resultado é: " + resultado); 
	
	scanner.close();
	
	}
}
	

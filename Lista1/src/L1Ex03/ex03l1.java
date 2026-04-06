package L1Ex03;

import java.util.Scanner;

public class ex03l1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Me fale a largura do lote: ");
		int largura = scanner.nextInt();
		
		System.out.println("Me o comprimento do lote: ");
		int comprimento = scanner.nextInt();
		
		int lote = comprimento * largura;
		
		System.out.println("O Tamanho desse lote é: " + lote + "m²");
		
		
	}

}

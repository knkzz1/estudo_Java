package L4Ex01;

import java.util.Scanner;

public class ex01l4 {
	 public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        int numero;
        int resultado = 1;
	
        do {
            System.out.print("Digite um número inteiro não negativo: ");
            numero = sc.nextInt();
		} while (numero < 0);
			
			System.out.println("Número digitado: " + numero);
			
			for (int i = 1; i <= numero; i++) {
				 resultado *= i;
			}
			System.out.println(resultado);
    }
}

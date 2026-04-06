package L2Ex03;

public class ex03l2 {
	public static void main(String[] args) {
		
		int produto = 1;
		
		for (int i = 0; i <= 15; i++) {
			if ( i % 2 == 1) {
				produto *= i;
			}
		}
		
		System.out.println("A soma dos número ímpares até 15 é: " + produto);
	}
}

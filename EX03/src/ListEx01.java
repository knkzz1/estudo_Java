import java.util.Scanner;

public class ListEx01 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Me dale o 1º nome: ");
	String nome1 = scanner.nextLine();
	
	System.out.println("Me dale o 2º nome: ");
	String nome2 = scanner.nextLine();
	
	System.out.println("Me dale o 3º nome: ");
	String nome3 = scanner.nextLine();

	
	System.out.println(nome1 + " e " + nome2 + "\n" + nome3);
	scanner.close();

	}
}

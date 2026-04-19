package L3Ex03;

public class ex03l3 {

	public static void main(String[] args) {

        Criptografia n1 = new Criptografia(); 
        n1.criptografando(n1.numeros);
        
        System.out.println("\n\n");
        
        n1.descriptografando(n1.numeros);
	}
}
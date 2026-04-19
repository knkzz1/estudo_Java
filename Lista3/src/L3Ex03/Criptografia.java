package L3Ex03;

public class Criptografia {
	
	int[] numeros = {1,2,3,4};
	
	
	int[] criptografando(int[]numeros) {
		int digito1 = numeros[2] + 1;
		int digito2 = numeros[3] + 1;
		int digito3 = numeros[0] + 1;
		int digito4 = numeros[1] + 1;
		
		//System.out.println(digito1);
		//System.out.println(digito2);
		//System.out.println(digito3);
		//System.out.println(digito4);
		
		int[] numero_criptografado = new int[4];
		numero_criptografado[0] = digito1;
		numero_criptografado[1] = digito2;
		numero_criptografado[2] = digito3;
		numero_criptografado[3] = digito4;
		
		for (int i = 0; i < numero_criptografado.length; i++) {	
			System.out.println(numero_criptografado[i]);
			}
		return numero_criptografado;
		}
	
	void descriptografando (int []numero_criptografado) {
		
		
		for (int i = 0; i < numero_criptografado.length; i++) {	
			System.out.println(numero_criptografado[i]);
			}
}
}

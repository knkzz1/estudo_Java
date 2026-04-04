package EX02P;

public class Carro {
	
	 String modelo;
	 String marca;
	 int ano;
	 int velocidade;
	  
	void aceleracao(int aceleracao){
		velocidade += aceleracao;
	}
	
	void freiar(int reduzir){
		velocidade -= reduzir;
	}
	
	void buzinar() {
		System.out.println("bibibi\n");
	}
	
	
}

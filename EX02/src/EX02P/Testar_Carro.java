package EX02P;

public class Testar_Carro {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		c1.marca = "Fiat";
		c1.modelo = "Siena";
		c1.ano = 2013;
		c1.velocidade = 70;
		
		System.out.println("Marca: " + c1.marca);
		System.out.println("Modelo: " + c1.modelo);
		System.out.println("Ano: " + c1.ano);
		System.out.println("A velocidade do carro é: " + c1.velocidade + "\n");
		
		
		System.out.println("***Estamos dirigindo***");
		
		c1.aceleracao(30);
		
		
		c1.buzinar();
		
		System.out.println("A velocidade do carro é: " + c1.velocidade + "\n");
		
		c1.buzinar();
		
		c1.freiar(50);
		
		System.out.println("A velocidade do carro é: " + c1.velocidade + "\n");
		
		
	}
}

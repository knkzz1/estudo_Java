package L14Ex01;

public class Mamifero extends Animal {
	
	//atributos
	
	private String alimento;
	
	//construtores
	
	Mamifero(String nome, float comprimento, int num_patas, String cor, String ambiente, float vel_media, String alimento){
	super(nome,comprimento, num_patas, cor, ambiente,vel_media);
	this.alimento = alimento;
	}

	
	//getters e setters 
	
	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	//métodos
	
	public void dadosMamifero() {
		dados();
		System.out.println("ALIMENTO: " + getAlimento());
	}
	
	
	
	
	
	
}
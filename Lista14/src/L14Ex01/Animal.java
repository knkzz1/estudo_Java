package L14Ex01;

public class Animal {
	
	//atributos
	
	private String nome;
	private float comprimento;
	private int num_patas;
	private String cor;
	private String ambiente;
	private float vel_media;
	
	
	//construtores
	
	public Animal(String nome, float comprimento, int num_patas, String cor, String ambiente, float vel_media) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.num_patas = num_patas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.vel_media = vel_media;
	}

	//getters e setters
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public float getComprimento() {
		return comprimento;
	}


	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}


	public int getNum_patas() {
		return num_patas;
	}


	public void setNum_patas(int num_patas) {
		this.num_patas = num_patas;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getAmbiente() {
		return ambiente;
	}


	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}


	public float getVel_media() {
		return vel_media;
	}


	public void setVel_media(float vel_media) {
		this.vel_media = vel_media;
	}
	
	//métodos
	
	public void dados() {
		System.out.println("NOME: " + getNome());
		System.out.println("COMPRIMENTO: " + getComprimento());
		System.out.println("NÚMERO DE PATAS: " + getNum_patas());
		System.out.println("COR: " + getCor());
		System.out.println("AMBIENTE: " + getAmbiente());
		System.out.println("VELOCIDADE MÉDIA: " + getVel_media());
	}
	
	
	
	
}

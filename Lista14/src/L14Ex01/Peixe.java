package L14Ex01;

public class Peixe extends Animal {
	
	//atributos
	private String caracteristica;
	
	//construtores
	
	Peixe(String nome, float comprimento, int num_patas, String cor, String ambiente, float vel_media, String caracteristica) {
		super(nome, comprimento, num_patas, cor, ambiente, vel_media);
		this.caracteristica = caracteristica;
	}
	
	//getters e setters
	
	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	//métodos
	
	public void dadosPeixe() {
        dados(); // chama método da classe Animal
        System.out.println("CARACTERÍSTICA: " + getCaracteristica());
    }

}

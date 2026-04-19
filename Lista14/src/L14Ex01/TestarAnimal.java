package L14Ex01;

public class TestarAnimal {

	public static void main(String[] args) {

		Mamifero c = new Mamifero("Camelo", 150, 4, "Amarelo", "Terra", 2.0f, null);
		
		Peixe t = new Peixe("Tubarão", 300, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e Cauda");
		
		Mamifero u = new Mamifero("Urso-do-Canadá", 180, 4, "Vermelho", "Terra", 0.5f, "Mel");

		System.out.println("===============================");
		c.dadosMamifero();
		System.out.println("===============================");
		t.dadosPeixe();
		System.out.println("===============================");
		u.dadosMamifero();
		System.out.println("===============================");
	}

}

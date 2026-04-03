package EX01P;


public class Testar_Lampada {
    public static void main(String[] args) {
    	
        // Criando objetos da classe Lampada
        Lampada lamp1 = new Lampada(false); // começa desligada
        Lampada lamp2 = new Lampada(true);  // começa ligada

        // Testando métodos
        System.out.println("Lampada 1: " + lamp1.observar()); // imprime "Desligada"
        
        lamp1.ligar(); // liga a lampada 1
        
        System.out.println("Lampada 1: " + lamp1.observar()); // imprime "Ligada"
      

        
        
        System.out.println("Lampada 2: " + lamp2.observar()); // imprime "Ligada"
        
        lamp2.desligar(); // desliga a lampada 2
        
        System.out.println("Lampada 2: " + lamp2.observar()); // imprime "Desligada"
    }
}
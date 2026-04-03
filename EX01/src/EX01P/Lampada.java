package EX01P;

public class Lampada {
    boolean status; // atributo que indica se a lâmpada está ligada ou desligada

    // Construtor
    public Lampada(boolean statusInicial) {
    status = statusInicial; // define o estado inicial da lâmpada
    }

    // Método para ligar a lâmpada
    void ligar() {
        status = true;
    }

    // Método para desligar a lâmpada
    void desligar() {
        status = false;
    }

    // Método para observar o estado da lâmpada
    String observar() {
        if (status) {
            return "Ligada";
        } else {
            return "Desligada";
        }
    }
}
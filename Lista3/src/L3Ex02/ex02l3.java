package L3Ex02;

public class ex02l3 {
    public static void main(String[] args) {

        String horario = args[0];
        
        String horas = horario.substring(0,2);  
        String minutos = horario.substring(3,5);  
        String segundos = horario.substring(6,8);  
        
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }
}
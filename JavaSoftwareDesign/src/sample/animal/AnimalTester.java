package sample.animal;

public class AnimalTester {
    public static void main(String[] args) {
        Shark shark1 = new Shark("Glaeocerdo cuvier",
                                "Tubarão Tigre",
                                70,
                                400.0);

        /*System.out.println(shark1.getSciName());
        System.out.println(shark1.getPopName());
        System.out.println(shark1.getLifeTime());
        System.out.println(shark1.getMass());
        System.out.println(shark1.getNumFins());

        /shark1.born();
        shark1.eat();
        shark1.grows();
        shark1.reproduces();
        shark1.die();
        shark1.swim();*/

        System.out.println(shark1);
    }
}
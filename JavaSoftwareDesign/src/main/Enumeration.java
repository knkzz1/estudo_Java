package main;

public enum Enumeration {
    //Objetos
    ENUM_OBJECT_1(123, "Texto 1"),
    ENUM_OBJECT_2( 456, "Texto 2"),
    ENUM_OBJECT_3(789, "Texto 3");

    //Atributos
   private final int value1;
   private final String value2;

    //Construtor
    Enumeration(int value1, String value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    //Métodos

    public int getValue1() {
        return value1;
    }

    public String getValue2() {
        return value2;
    }
}

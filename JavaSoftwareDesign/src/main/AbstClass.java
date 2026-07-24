package main;

public abstract class AbstClass implements Interface1, Interface2{
    public int key;

    public AbstClass() {
        key = 9999;
    }


    public void sayHello() {
        System.out.println("Olá!");
    }

    public abstract void sayHi();

    public void interfaceMethod2(){
        System.out.println("Método 2 da interface1");
    }
}
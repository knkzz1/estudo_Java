package sample.animal;

import java.util.ArrayList;
import java.util.List;

public final class ImmutClass {

    //Atributos
    private final String sciName;
    private final String popName;
    private final int lifeTime;
    private final double mass;
    private final List<String> habitat;
    //Construtor

    public ImmutClass(String sciName, String popName, int lifeTime, double mass, List<String> habitat){
        this.sciName = sciName;
        this.popName = popName;
        this.lifeTime = lifeTime;
        this.mass = mass;
        this.habitat = new ArrayList<>(habitat);
    }

    //Métodos
    public String getSciName() {
        return sciName;
    }

    public String getPopName() {
        return popName;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public double getMass() {
        return mass;
    }

    public List<String> getList() {return habitat;}

    @Override
    public String toString() {
        return "Informações do Animal " +
                "\nNome Científico:\t" + sciName +
                "\n Nome Popular:\t\t\t" + popName +
                "\nExpectativa de vida:\t" + lifeTime +
                "\nExpectativa de Massa:\t" + mass +
                "\nHabitat: " + habitat;
    }
}
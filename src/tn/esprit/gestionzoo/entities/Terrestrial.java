package tn.esprit.gestionzoo.entities;
//Instruction20:
public class Terrestrial extends Animal {
    //Instruction22:
    protected int nbrLegs;
    //Instruction21:
    public Terrestrial() {}

    //Instruction22:
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs=nbrLegs;
    }

}

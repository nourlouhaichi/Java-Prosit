package tn.esprit.gestionzoo.entities;
//Instruction20:
public class Aquatic {
    //Instruction22:
    protected  String habitat;
    //Instruction21:
    public Aquatic() {
        this.habitat="";
    }

    //Instruction22:
    public Aquatic(String habitat) {
        this.habitat=habitat;
    }

    //Instruction23:
    @Override
    public String toString()
    {
        return "Habitat: " + this.habitat  ;
    }

    //Instruction24:
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}

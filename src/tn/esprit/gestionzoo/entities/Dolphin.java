package tn.esprit.gestionzoo.entities;
//Instruction20:
public class Dolphin extends Aquatic {
    //Instruction22:
    protected float swimmingSpeed;

    //Instruction21:
    public Dolphin() {}

    //Instruction22:
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    //Instruction23:
    @Override
    public String toString()
    {
        return " " + super.toString() + "swimmingSpeed: " + this.swimmingSpeed ;
    }

    //Instruction24:
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

}

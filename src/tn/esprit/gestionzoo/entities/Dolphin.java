package tn.esprit.gestionzoo.entities;
//Instruction20:
public class Dolphin extends Aquatic {
    //Instruction22:
    protected float swimmingSpeed;

    //Instruction21:
    public Dolphin() {
        super();
        this.swimmingSpeed=0;
    }

    //Instruction22:
    public Dolphin(String habitat, float swimmingSpeed) {
        super(habitat);
        this.swimmingSpeed=swimmingSpeed;
    }

    //Instruction23:
    @Override
    public String toString()
    {
        return "Habitat: " + super.habitat + ", swimmingSpeed: " + this.swimmingSpeed ;
    }

    //Instruction24:
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

}

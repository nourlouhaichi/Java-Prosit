package tn.esprit.gestionzoo.entities;
//Instruction20:
public class Penguin extends Aquatic {
    //Instruction22:
    protected float swimmingDepth;
    //Instruction21:
    public Penguin() {}

    //Instruction22:
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    //Instruction23:
    @Override
    public String toString()
    {
        return " " + super.toString() + ", Swimming Depth: " + this.swimmingDepth ;
    }

    //Instruction28 :
    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}

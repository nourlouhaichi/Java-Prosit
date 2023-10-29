package tn.esprit.gestionzoo.entities;
//Instruction20:
public class Penguin extends Aquatic {
    //Instruction22:
    protected float swimmingDepth;
    //Instruction21:
    public Penguin() {
        super();
        this.swimmingDepth=0;
    }

    //Instruction22:
    public Penguin(String habitat, float swimmingDepth) {
        super(habitat);
        this.swimmingDepth=swimmingDepth;
    }

    //Instruction23:
    @Override
    public String toString()
    {
        return "Habitat: " + super.habitat + ", Swimming Depth: " + this.swimmingDepth ;
    }

    //Instruction28 :
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}

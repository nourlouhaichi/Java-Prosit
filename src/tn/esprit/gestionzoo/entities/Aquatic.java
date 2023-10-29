package tn.esprit.gestionzoo.entities;
//Instruction20:
public abstract class Aquatic extends Animal {
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
    /*public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }*/

    //Instruction28:
    public abstract void swim();

    //Instruction31:
    @Override
    public boolean equals(Object obj)
    {
        if (null == obj) return false;
        if (obj instanceof Aquatic aquatic) {
            return super.name.equals(aquatic.name) && super.age == aquatic.age && this.habitat.equals(aquatic.habitat);
        }
        return false;
    }
}

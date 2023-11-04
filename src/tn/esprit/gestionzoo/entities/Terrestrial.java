package tn.esprit.gestionzoo.entities;
//Instruction20:
public class Terrestrial extends Animal implements Omnivore<Food> {
    //Instruction22:
    protected int nbrLegs;
    //Instruction21:
    public Terrestrial() {}

    //Instruction22:
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs=nbrLegs;
    }

    //Instruction37:
    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("Terrestrial animal is eating both plants and meat.");
        } else {
            System.out.println("Terrestrial animal doesn't eat this combination of food.");
        }
    }

    @Override
    public void eatMeat(Food meat){
        if (meat == Food.MEAT) {
            System.out.println("Terrestrial animal is eating meat.");
        } else {
            System.out.println("Terrestrial animal doesn't eat this type of food.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT) {
            System.out.println("Terrestrial animal is eating plants.");
        } else {
            System.out.println("Terrestrial animal doesn't eat this type of food.");
        }
    }

}
//Instruction19:
package tn.esprit.gestionzoo.entities;

//Instruction5:
public class Animal {
    //Instruction18:
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public Animal() {
        this.family = "";
        this.name = "";
        this.age = 0;
        this.isMammal = false;
    }

    //Instruction6:
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    //Instruction9:
    @Override
    public String toString()
    {
        return "Name: " + this.name + ", Family: " + this.family + ", Age: " + this.age + ", Is Mammal: " + this.isMammal;
    }

    //Instruction18:
    ///Getters
    public String getFamily() {
        return this.family;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public boolean isMammal() {
        return this.isMammal;
    }

    ///Setters
    public void setFamily(String family) {
        this.family=family;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setAge(int age) {
        if (age>0) this.age=age;
        else System.out.println("L'âge doit être positif");
    }
    public void setMammal(boolean isMammal) {
        this.isMammal=isMammal;
    }
}

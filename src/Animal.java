//Instruction5:
public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

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
}

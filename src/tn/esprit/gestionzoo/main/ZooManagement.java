//Instruction19:
package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

import java.util.Scanner;

//Instruction1:
public class ZooManagement {
    int nbrCages=20;
    String zooName="my zoo";

    public static void main(String[] args) {
        ZooManagement zm = new ZooManagement();
        System.out.println(zm.zooName + " comporte " + zm.nbrCages + " cages");

        //Instruction2:
        Scanner console = new Scanner(System.in);
        System.out.println("Veuillez saisir un nouveau nom de zoo : ");
        zm.zooName = console.nextLine();
        System.out.println("Veuillez saisir le nombre de cages : ");
        zm.nbrCages = console.nextInt();

        //Instruction3:
        System.out.println("Le zoo " + zm.zooName + " comporte maintenant " + zm.nbrCages + " cages");

        //Instruction5:
        /*Animal lion= new Animal();
        lion.age=5;
        lion.family="family";
        lion.isMammal=true;
        lion.name="pyke";

        Zoo myZoo= new Zoo();
        myZoo.city="tunis";
        myZoo.name="zoo";
        myZoo.nbrCages=25;
        myZoo.animals[0]=lion;*/

        //Instruction7:
        Animal lion = new Animal("family", "pyke", 5, true);
        Animal tiger = new Animal("family", "tigro", 2, true);
        //Instruction14:
        Zoo myZoo = new Zoo("zoo", "tunis");

        //Instruction8:
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        //Instruction9:
        System.out.println(lion);

        //Instruction10:
        /*for (int i = 0; i < 1; i++) {
            myZoo.addAnimal(lion);
            myZoo.addAnimal(tiger);
        }*/
        /*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 25
        at Zoo.addAnimal(Zoo.java:37)
        at ZooManagement.main(ZooManagement.java:49)*/

        //Instruction11:
        System.out.println("****************************************/ Affichage de tableau /*****************************************************************");
        myZoo.listAnimal();

        System.out.println(myZoo.searchAnimal(lion));
        System.out.println(myZoo.searchAnimal(tiger));

        //Instruction13:
        //myZoo.removeAnimal(lion);
        System.out.println("****************************************/ Affichage de nouveau tableau /*****************************************************************");
        myZoo.listAnimal();

        //Instruction15 :
        myZoo.isZooFull();

        //Instruction16:
        Zoo myZoo2 = new Zoo("zoo2", "tunis2");
        //myZoo2.addAnimal(lion);
        System.out.println(myZoo.comparerZoo(myZoo, myZoo2));

        //Instruction21:
        //Aquatic aquatic1 = new Aquatic();
        Terrestrial terrestrial1 = new Terrestrial();
        Dolphin dolphin1 = new Dolphin();
        Penguin penguin1 = new Penguin();

        //Instruction22:
        //Aquatic aquatic2 = new Aquatic("lac");
        Terrestrial terrestrial2 = new Terrestrial(4);
        Dolphin dolphin2 = new Dolphin("ocean", 37);
        Penguin penguin2 = new Penguin("ocean", 150);

        System.out.println("****************************************/ Heritage /*****************************************************************");
        //Instruction23:
        //System.out.println(aquatic2);
        System.out.println(dolphin2);
        System.out.println(penguin2);

        //Instruction24:
        //aquatic2.swim(); //This aquatic animal is swimming.
        dolphin2.swim(); //This dolphin is swimming.
        penguin2.swim(); //This aquatic animal is swimming.

        System.out.println("****************************************/ Polymorphisme /*****************************************************************");
        //Instruction26:
        Zoo zoo = new Zoo("My Zoo", "City");
        zoo.addAquaticAnimal(dolphin2);
        zoo.addAquaticAnimal(penguin2);

        //Instruction27:
        for (int i = 0; i < zoo.compteur2; i++) {
            zoo.aquaticAnimals[i].swim();
        }

        //Instruction29:
        System.out.println(zoo.maxPenguinSwimmingDepth());

        //Instruction30:
        zoo.displayNumberOfAquaticsByType();

        //Instruction31:
        Dolphin dolphin3 = new Dolphin("ocean", 37);
        Dolphin dolphin4 = new Dolphin("beachgr", 33);
        System.out.println(dolphin2.equals(dolphin3)); //true
        System.out.println(dolphin4.equals(dolphin3)); //False

        System.out.println("****************************************/ Exception /*****************************************************************");
        //Instruction33:
        Animal lion2 = new Animal("family", "p", 5, true);
        Animal tiger2 = new Animal("family", "t", -2, true);
        try {
            zoo.addAnimal(lion);
            zoo.addAnimal(tiger);
            zoo.addAnimal(lion2);
            zoo.addAnimal(tiger2);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
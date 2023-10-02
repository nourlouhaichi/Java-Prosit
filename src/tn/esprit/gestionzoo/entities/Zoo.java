//Instruction19:
package tn.esprit.gestionzoo.entities;

//Instruction5:
public class Zoo {
    //Instruction18:
    private Animal [] animals;
    private String name;
    private String city;
    //Instruction14:
    private final int NBRCAGES=25;
    private int compteur=0;

    public Zoo() {
        animals = new Animal[NBRCAGES];
        this.name = "";
        this.city = "";
    }

    //Instruction6:
    public Zoo(String name, String city) {
        animals = new Animal[NBRCAGES];
        this.name = name;
        this.city = city;
    }

    //Instruction8:
    /*public void displayZoo(Zoo z) {
        System.out.println(z.name);
        System.out.println(z.city);
        System.out.println(z.NBRCAGES);
    }*/
    public void displayZoo() {
        System.out.println("Name: "+this.name);
        System.out.println("City: "+this.city);
        System.out.println("NbCage: "+this.NBRCAGES);
    }

    //Instruction9:
    @Override
    public String toString() {
        return this.name + " " + this.city + " " + this.NBRCAGES;
    }

    //Instruction10:
    public boolean addAnimal(Animal animal) {
        //Instruction12:
        if(searchAnimal(animal)!=-1) return false;
        //Instruction17:
        if(isZooFull()) return false;
        else {
            this.animals[this.compteur] = animal;
            this.compteur = this.compteur + 1;
            return true;
        }
    }

    //Instruction11:
    public void listAnimal() {
        for(int i=0;i<this.compteur;i++) {
            System.out.println("**********tableau"+(i+1)+"*********");
            System.out.println(this.animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < this.compteur; i++) {
            if (animal.getName() == this.animals[i].getName()) {
                return i;
            }
        }
        return -1;
    }

    //Instruction13:
    public boolean removeAnimal(Animal animal) {
        if(searchAnimal(animal)==-1) {
            return false;
        }
        else {
            for (int i = searchAnimal(animal); i < this.compteur; i++) {
                this.animals[i] = this.animals[i + 1];
                this.animals[this.compteur] = null;
                this.compteur=this.compteur-1;
            }
            return true;
        }
    }

    //Instruction15:
    public boolean isZooFull() {
        if (this.compteur==NBRCAGES) {
            System.out.println("zoo est plein");
            return true;
        }
        else {
            System.out.println("zoo n'est pas plein");
            return false;
        }
    }

    //Instruction16:
    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.compteur>z2.compteur)
           return z1;
        else
            return z2;
    }

    //Instruction18:
    ///Getters
    public String getName() {
        return this.name;
    }
    public String getCity() {
        return this.city;
    }
    ///Setters
    public void setName(String name) {
        if (name != null && !name.isEmpty()) this.name = name;
        else System.out.println("Le nom de zoo doit être ecrit");
    }
    public void setCity(String city) {
        this.city = city;
    }
}

package tn.esprit.gestionzoo.entities;
//Instruction35:
public interface Omnivore<T> extends Carnivore<T>, Herbivore<T>{
    void eatPlantAndMeat(T food);
}

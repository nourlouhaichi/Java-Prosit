// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Employe e1 = new Employe(1,"nom1","prenom1","dep1",1);
        Employe e2 = new Employe(2,"nom2","prenom2","dep2",2);
        Employe e3 = new Employe(3,"nom3","prenom3","dep3",3);

        Departement d1 = new Departement(1,"dep1",10);
        Departement d2 = new Departement(2,"dep2",10);
        Departement d3 = new Departement(3,"dep3",10);

        //Map
        AffectationHashMap affectations= new AffectationHashMap();

        //Ajout map
        affectations.ajouterEmployeDepartement(e1,d1);
        affectations.ajouterEmployeDepartement(e2,d2);
        affectations.ajouterEmployeDepartement(e2,d2); //Cet employé est déjà affecté à un département.
        affectations.ajouterEmployeDepartement(e3,d3);

        //Affichage map
        affectations.afficherEmployesEtDepartements();

        //Supression
        affectations.supprimerEmploye(e1);

        //Affichage map
        affectations.afficherEmployesEtDepartements();

        //Affichage employe
        affectations.afficherEmployes();

        //Affichage departement
        affectations.afficherDepartements();

    }
}
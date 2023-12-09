import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class SocieteArrayList implements IGestion <Employe> {

    private List<Employe> employes;

    public SocieteArrayList() {
        employes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe e) {
        if(!rechercherEmploye(e)) {
            employes.add(e);
        }
        else System.out.println("Employe existe deja!");
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : employes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employes.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        if(rechercherEmploye(e)) {
            employes.remove(e);
        }
        else System.out.println("Employe non existant!");
    }

    @Override
    public void displayEmploye() {
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(employes, new Employe());
    }
}
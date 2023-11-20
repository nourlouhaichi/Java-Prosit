import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements  IDepartement<Departement>{

    public Set<Departement> departements;

    public DepartementHashSet() {
        departements = new HashSet<>();
    }
    @Override
    public void ajouterDepartement(Departement dep) {
        if (!rechercherDepartement(dep)) {
            departements.add(dep);
        }
        else System.out.println("Existe deja!");
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement dep : departements) {
            if(nom.equals(dep.getNom())) return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement dep) {
        return departements.contains(dep);
    }

    @Override
    public void supprimerDepartement(Departement dep) {
        if (rechercherDepartement(dep)) {
            departements.remove(dep);
        }
        else System.out.println("N'existe pas!");
    }

    @Override
    public void displayDepartement() {
        for (Departement dep : departements) {
            System.out.println(dep);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sortDep = new TreeSet<>(departements);
        return sortDep;
    }
}

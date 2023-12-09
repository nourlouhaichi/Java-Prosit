import java.util.*;

public class AffectationHashMap  {

    private Map<Employe,Departement> affectations;

    public AffectationHashMap() {
        affectations= new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (!rechercherEmploye(e))
        affectations.put(e,d);
        else System.out.println("Cet employé est déjà affecté à un département.");
    }

    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employe,Departement> entry : affectations.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        //Autre Methode:
        //System.out.println(affectations);
    }

    public void supprimerEmploye (Employe e) {
        if (rechercherEmploye(e)) {
            affectations.remove(e);
        }
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (rechercherEmploye(e) && rechercherDepartement(d)) {
            affectations.remove(e,d);
        }
    }

    public void afficherEmployes() {
        Set<Employe> affectationsEmployes = affectations.keySet();
        Iterator<Employe> iterator = affectationsEmployes.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void afficherDepartements() {
        Collection<Departement> affectationsDepartements = affectations.values();
        for (Departement dep : affectationsDepartements) {
            System.out.println(dep);
        }
        //Autre Methode:
        /*Iterator<Departement> iterator = affectationsDepartements.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/
    }

    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        Comparator<Employe> idemploye = new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                return e1.getId() - e2.getId();
            }
        };

        TreeMap<Employe, Departement> treemap = new TreeMap<>(idemploye);
        treemap.putAll(affectations); // Copy the entries from affectations to treemap
        return treemap;
    }

}

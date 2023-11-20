import java.util.Objects;

public class Departement {
    private int id;
    private String nom;
    private int nbemploye;

    public Departement() {}

    public Departement(int id, String nom, int nbemploye) {
        this.id = id;
        this.nom = nom;
        this.nbemploye = nbemploye;
    }

    @Override
    public String toString() {
        return "Departement: ID: " + id + "Nom: " + nom + "Nombre des employes: " + nbemploye;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj instanceof Departement dep) {
            return dep.getId() == id && nom.equals(dep.getNom());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, nbemploye);
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNbemploye() {
        return nbemploye;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbemploye(int nbemploye) {
        this.nbemploye = nbemploye;
    }
}

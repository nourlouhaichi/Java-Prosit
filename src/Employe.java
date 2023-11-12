import java.util.Comparator;

public class Employe implements  Comparable<Employe>, Comparator<Employe> {
    private int id;
    private String nom;
    private String prenom;
    private String nomDep;
    private int grade;

    public Employe() {

    }

    public Employe(int id, String nom, String prenom, String nomDep, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDep = nomDep;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o instanceof Employe employe) {
            return id == employe.id && nom.equals(employe.nom) ;
        }
        return false;
    }

    @Override
    public String toString() {
        return  "id: " + id + " nom: " + nom + " prenom: " + prenom + " nomDep: " + nomDep + " grade: " + grade ;
    }

    @Override
    public int compareTo(Employe e) {
        return this.id - e.id;
    }

    @Override
    public int compare(Employe e1, Employe e2) {
        int compareDep = e1.nomDep.compareTo(e2.nomDep);
        if (compareDep == 0) {
            return e1.grade - e2.grade;
        }
        return compareDep;
    }

    ///Getters:
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomDep() {
        return nomDep;
    }

    public int getGrade() {
        return grade;
    }

    ///Setters:
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
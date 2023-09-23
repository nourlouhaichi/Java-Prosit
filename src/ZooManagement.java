import java.util.Scanner;

//Instruction1:
public class ZooManagement {
    int nbrCages=20;
    String zooName="my zoo";

    public static void main(String[] args) {
        ZooManagement zm= new ZooManagement();
        System.out.println(zm.zooName+" comporte "+zm.nbrCages+" cages");

        //Instruction2:
        Scanner console = new Scanner(System.in);
        System.out.println("Veuillez saisir un nouveau nom de zoo : ");
        zm.zooName = console.nextLine();
        System.out.println("Veuillez saisir le nombre de cages : ");
        zm.nbrCages = console.nextInt();

        //Instruction3:
        System.out.println("Le zoo " + zm.zooName + " comporte maintenant " + zm.nbrCages + " cages");
    }
}
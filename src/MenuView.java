import SandboxModele.Menagerie;

import java.util.Scanner;

public class MenuView {
    Menagerie modele;
    public MenuView(Menagerie newModele){
        modele = newModele;
    }

    String displayBasicMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Remplis-moi les cages");
        System.out.println("2. Liste des cages");
        System.out.println("\n0. Quitter");

        System.out.print("Votre choix: ");
        String choix = scanner.nextLine();
        return choix;
    }

    void displayListeCages(Menagerie pouet) {
      int i=0;
      int taille = modele.getTailleCages();
        System.out.println("\nListe des cages:\n----------------");
      while (i<taille){
          System.out.println(String.valueOf(i+1)+ ". Nom: "+ modele.getAnimalNom(i) + " - Type:"+modele.getAnimalType(i));
          i++;
      }
        System.out.println("\n --------------------------------\n");
    }
    void displayMenu2(){
        System.out.println("Bite");
    }
}

package SandboxModele;

import java.util.ArrayList;

public class Menagerie {
    private int tailleCages = 10;
    private Cage[] mescages = new Cage[tailleCages];

    public Menagerie(){
        int i = 0;
        while (i<tailleCages){
            mescages[i] = new Cage(String.valueOf(i));
            i++;
        }
    }
    public void initMenagerie(){
        String[] nomsAnimaux = new String[]{"Rusty", "Rantanplan", "Kiki", "Pirouette", "Gamelle", "Cucul", "Zouzou", "Kikine", "Kokof", "LaPute"};
        String[] typesAnimaux = new String[]{"Chien","Chat","Serpent","Oiseau","Grille-Pain","Fusée","Cheval","Reptile","Jean-Jacques Goldman","42"};
        int i = 0;
        while (i<tailleCages){
            mescages[i].ajouterAnimal(typesAnimaux[i], nomsAnimaux[i]);
            i++;
        }
    }
    public Cage[] listCages(){
        return this.mescages;
    }
    public int getTailleCages()
    {
        return tailleCages;
    }
    public Cage getCage(int indice){
        return this.mescages[indice];
    }
    public String getAnimalType(int indice)
    {
        return this.mescages[indice].getAnimalType();
    }

    public String getAnimalNom(int indice)
    {
        return this.mescages[indice].getAnimalNom();
    }
}

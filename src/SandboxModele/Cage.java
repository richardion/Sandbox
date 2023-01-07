package SandboxModele;

public class Cage {
    private boolean vide;
    private Animal monAnimal;
    private String matricule;

    public Cage(String matriculeCage){
        vide = true;
        this.matricule = matriculeCage;
    }

    public void ajouterAnimal(String typeAnimal, String nomAnimal){
        if (checkCageVide() == true){
            this.monAnimal = new Animal(typeAnimal, nomAnimal);
        }
        else{

        }
    }
    boolean checkCageVide(){
        if (monAnimal == null){
            return true;
        }
        else {
            return false;
        }
    }
    public String getAnimalType()
    {
        return this.monAnimal.getType();
    }
    public String getAnimalNom()
    {
        return this.monAnimal.getNom();
    }

}

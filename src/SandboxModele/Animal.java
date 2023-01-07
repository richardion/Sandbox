package SandboxModele;

public class Animal {
    private String type;
    private String nom;

    public Animal(String nouvelAnimal, String nouveauNom)
    {
        this.type = nouvelAnimal;
        this.nom = nouveauNom;
    }

    public String getType(){
        return this.type;
    }
    public String getNom(){
        return this.nom;
    }
    public void setType(String monType){
        this.type = monType;
    }

}

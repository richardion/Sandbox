import SandboxModele.Menagerie;

public class Controller {
private MenuView myview;
private Menagerie mymodel;
    public Controller(MenuView vue, Menagerie model){
        myview = vue;
        mymodel = model;
        String choix;
        while(true){
            choix = myview.displayBasicMenu();
            switch(choix){
                case "1":
                    mymodel.initMenagerie();
                    break;
                case "2":
                    myview.displayListeCages(mymodel);
                    break;
                case "0":
                    System.exit(0);
                    break;
            }
        }
    }

}

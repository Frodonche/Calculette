package general;

import controller.MainController;
import view.MainView;
import model.MainModel;

public class Launcher {
	public static void main(String[] args){
		MainView maVue = new MainView();
		
		MainController monController = new MainController(); 
		monController.setView(maVue);
		
		MainModel modele = new MainModel();
		modele.addController(monController);
		
		maVue.setController(monController);
		monController.setModel(modele);
	}
}

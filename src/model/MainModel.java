package model;

import java.util.ArrayList;

import controller.Controller;
import controller.MainController;
import operations.*;

public class MainModel {
	ArrayList<Controller> listControllers;
	ArrayList<Operation> listOperations;
	String buffer;
	int result;
	
	
	// ------------- PARTIE DECLARATION ---------- //
	
	public MainModel(){
		listControllers = new ArrayList<Controller>();
		buffer = new String();
	}
	
	public void addController(MainController monController){
		this.listControllers.add(monController);
	}
	
	
	// ------------- PARTIE INTERACTION ET CALCULS --------- //
	
	public void bufferUpdate(String update){
		this.buffer = update;
	}
	
	// celle la marche pas encore
	public String compute(ArrayList<String> maListe){
	
		return "coucou";
	}
}
  
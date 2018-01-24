package model;

import java.util.ArrayList;

import controller.Controller;
import controller.MainController;

import view.View;

public class MainModel {
	ArrayList<Controller> listControllers;
	String buffer;
	double result;
	
	
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
	
	public void compute(ArrayList<String> maListe){
		String prec = " ";
		for(String s : maListe){
			if(s == "+") // A CONTINUER
		}
	}
}
  
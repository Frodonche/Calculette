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
		String precOp = " ";
		String precDigit = " ";
		int result = 0;
		for(String s : maListe){
			if(s == "+"){ 
				precOp = "+";
			}else if(s == "-"){
				precOp = "-";
			}else{ // si on tombe sur un digit
				if(precOp == " " && precDigit == " "){ // si c'est la premiere fois qu'on tape un caractere
					precDigit = s;
					precOp = "+"; // par defaut : +
				}else if(precOp == "+"){
					
				}else if(precOp == "-"){
					
				}else{ // si c'est la suite d'un nombre
					
				}
			}
		}
		return 2+""; // return bidon pour l'instant
	}
}
  
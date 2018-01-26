package controller;

import java.util.ArrayList;

import model.MainModel;

import view.View;

public class MainController implements Controller{
	public static final int PLUS = -100;
    public static final int MINUS = -200;
    public static final int EQUAL = -400;
	
	private String buffer;
	private View maVue;
	private ArrayList<String> bufferList;
	private String bufferAff;
	private MainModel monModele;
	
	public MainController(){
		this.buffer = new String("0+");
		this.bufferList = new ArrayList<String>();
		this.bufferAff = new String();
	}
	
	public void setView(View v){
		this.maVue = v;
	}
	
	public void setModel(MainModel m){
		this.monModele = m;
	}
	
	public void addBuffer(int b){
		if(b >= 0){
			this.buffer += b;
			this.bufferAff += b;
		}else{
			bufferList.add(buffer);
			if(b == PLUS){
				bufferList.add("+");
				this.bufferAff += "+";
			}
			if(b == MINUS){
				bufferList.add("-");
				this.bufferAff += "-";
			}
			if(b == EQUAL){
				//bufferList.add("=");
				bufferAff = monModele.compute(bufferList);			
			}
			this.buffer = new String();
		}
		
		System.out.println("Buffer : "+buffer);
		
		maVue.update(bufferAff);
	}

	
	
}

package aula2;

import javax.swing.JOptionPane;

public class Lampada {// Atributos
	
	public String watts;
	public String fabricante;
	boolean ligada;
	
	
	public Lampada(String watts, String fabricante){//construtores //aqui desnecessarios
		this.watts = watts;
		this.fabricante = fabricante;
		
}
public void  Ligada(){
	JOptionPane.showMessageDialog(null,"Ligada");
	this.ligada = true;
}
public void Desligada(){
	JOptionPane.showMessageDialog(null,"Desligada");
	this.ligada = false;
}
	public boolean estaligada(){
		return ligada;
	}
}

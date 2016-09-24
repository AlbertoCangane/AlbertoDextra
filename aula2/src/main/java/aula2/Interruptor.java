package aula2;

	
public class Interruptor {
	Lampada lampada;
	
	public Interruptor(Lampada lampada){
		this.lampada = lampada;
	}
	
	public void apertar(){
		if (lampada.estaligada()){
			lampada.Desligada();
		}else{
			lampada.Ligada();
		
		
	}
	
}
}
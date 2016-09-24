package aula2;

public class Testarinterruptor {

	public static void main(String[] args) {

		Lampada lampada = new Lampada ("60", "Fabrincante");
		Interruptor interruptor = new Interruptor(lampada);
		
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		
		
	}

}

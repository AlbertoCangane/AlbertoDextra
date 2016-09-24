package aula2;

import java.util.Random;

import javax.swing.JOptionPane;

public class chuteRandom {

	public static void main(String[] args) {
		int numero;
		int aleatorio = new Random().nextInt(10) + 1;
		int cont = 1;
		numero = Integer.parseInt(JOptionPane.showInputDialog("informe um valor de 1 a 10"));

		for (; numero != aleatorio;) {

			JOptionPane.showMessageDialog(null, "voce errou, tente de novo");
			//JOptionPane.showMessageDialog(null, "io numer certo era" + aleatorio);
			numero = Integer.parseInt(JOptionPane.showInputDialog("informe um valor de 1 a 10"));
			cont++;
		}

		JOptionPane.showMessageDialog(null, "voce acertou em" + cont + "tentantivas");
	}

}

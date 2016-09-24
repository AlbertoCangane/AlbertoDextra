package aula2;

import javax.swing.JOptionPane;

public class inteiroSoma {

	public static void main(String[] args) {
		int numero;
		int cont = 0;

		numero = Integer.parseInt(JOptionPane.showInputDialog("informe o numero "));

		for (int i = 1; i <= numero; i++) {
			if (i % 2 == 0) {
				cont++;
				JOptionPane.showMessageDialog(null, "os valores são" + i);
			}
			if (cont == 10)//nao pode ter ponto e virgula nesse cara.
				break;
		}
	}

}

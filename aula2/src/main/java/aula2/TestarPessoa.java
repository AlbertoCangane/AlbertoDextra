package aula2;

import javax.swing.JOptionPane;

public class TestarPessoa {

	public static void main(String[] args) {
		
		String nome;
		double cpf;
		int rg;
		
		nome = JOptionPane.showInputDialog("informe o nome da pessoa");
		cpf = Double.parseDouble(JOptionPane.showInputDialog("Informe o cpf"));
		rg = Integer.parseInt(JOptionPane.showInputDialog("informe o rg"));

		
		Pessoa pessoa = new Pessoa (nome,cpf,rg);
			JOptionPane.showMessageDialog(null,pessoa);
		
	}

}

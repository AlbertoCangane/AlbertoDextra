package aula2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class meses {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("informe o valor numero de um mes");
		int mesFault = scanner.nextInt();
		
		switch(mesFault){
		case 1:
			JOptionPane.showMessageDialog(null,"janeiro");
		case 2:
			JOptionPane.showMessageDialog(null,"Fevereiro");
		case 3:
			JOptionPane.showMessageDialog(null,"Março");
		case 4:
			JOptionPane.showMessageDialog(null,"Abril");
		case 5:
			JOptionPane.showMessageDialog(null,"Maio");
		case 6:
			JOptionPane.showMessageDialog(null,"Junho");
		case 7:
			JOptionPane.showMessageDialog(null,"Julho");
		case 8:
			JOptionPane.showMessageDialog(null,"Agosto");
		case 9:
			JOptionPane.showMessageDialog(null,"Setembro");
		case 10:
			JOptionPane.showMessageDialog(null,"Outubro");
		case 11:
			JOptionPane.showMessageDialog(null,"Novembro");
		case 12:
			JOptionPane.showMessageDialog(null,"Dezembro");
		default:
			System.out.println("NA");
		}
		scanner.close();

	}

}

package view;

import javax.swing.JOptionPane;

import controller.fatorialController;

public class principal {

	public static void main(String[] args) {
		
		fatorialController fat = new fatorialController();
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));		
		int fatorial = fat.calculaFatorial(numero);
		JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " � " + fatorial);

	}

}

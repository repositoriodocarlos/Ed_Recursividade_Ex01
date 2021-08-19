package view;

import javax.swing.JOptionPane;

import controller.fatorialController;

public class principal {

	public static void main(String[] args) {
		
		fatorialController fat = new fatorialController();
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));		
		int fatorial = fat.calculaFatorial(numero);
		JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é " + fatorial);

	}

}

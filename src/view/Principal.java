package view;

import javax.swing.JOptionPane;
import controller.SomatoriaController;

public class Principal {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero para calcular a serie: "));
		SomatoriaController sc = new SomatoriaController();
		
		double soma = sc.somaSerie((double)num);
		System.out.print("A soma da serie é: " +soma);
		
	}
}

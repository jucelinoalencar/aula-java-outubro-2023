package algoritimos.io;

import javax.swing.JOptionPane;

public class A02_Entrada_GUI {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog(null, "digite seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "digite sua idade"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "digite seu peso"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "digite sua altura"));
		char tipo = JOptionPane.showInputDialog(null, "digite seu tipo").charAt(0);
		
		JOptionPane.showMessageDialog(null, "Olá "+nome+" \nidade: "+idade+" anos"+"\npeso: "+peso+ " \naltura: "+altura+
				"\ntipo: "+tipo+"");
		
	}

}

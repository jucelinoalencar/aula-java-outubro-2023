package algoritimos.io;

import javax.swing.JOptionPane;

public class A02_E04_Circunferencia {

	public static void main(String[] args) {
		
		double raio = 0;
		double circunferencia;
		
		raio = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o raio"));
		
		circunferencia = ((2*Math.PI)* raio );
		
		System.out.println(circunferencia);
		

	}

}

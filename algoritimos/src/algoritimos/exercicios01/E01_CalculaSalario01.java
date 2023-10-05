package algoritimos.exercicios01;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class E01_CalculaSalario01 {

	   public static void main(String[] args) {
		   
		  /** double salarioInicial, salarioFinal, porcentagem;
		   
		  salarioInicial = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o salário"));
		  porcentagem = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o salário"));
		  
		  salarioFinal = salarioInicial + (salarioInicial*porcentagem/100);
		  
		  System.out.println(salarioFinal);
		  **/
		   
		   int anoNasc = 0, meses = 0, dias = 0;
		   
		   int idade = 0;
		   
		   Scanner leitor = new Scanner(System.in);
		   
		   System.out.println("digite o ano do seu nascimento");
		   anoNasc = leitor.nextInt();
		   
		   idade = 2023 - anoNasc;
		   
		   meses = idade*12;
		   dias = idade*365;
		   
		   System.out.println(idade);
		   System.out.println(meses);
		   System.out.println(dias+(idade/4));
		   
		   LocalDate aniversario = LocalDate.of(1983, Month.SEPTEMBER, 16);
		   
		   
		   
		   
		   
		   
		  
		   
		   
		  
	   }
	
	
}

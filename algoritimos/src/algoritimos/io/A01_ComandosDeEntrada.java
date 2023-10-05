package algoritimos.io;

import java.util.Scanner;

public class A01_ComandosDeEntrada {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite seu nome:");
		String nome = leitor.nextLine();
		
		System.out.println("digite sua idade:");
		int idade = leitor.nextInt();
		
		System.out.println("digite sua altura:");
		float altura = leitor.nextFloat();
		
		System.out.println("digite seu tipo sanguineo:");
		char tipoSanguineo = leitor.next().charAt(0);
		
		System.out.println("O nome digitador foi: "+nome);
		System.out.println("O nome digitador foi: "+idade);
		System.out.printf("altura: %.2f\n",altura);
		System.out.println("O nome digitador foi: "+tipoSanguineo);
		leitor.close();
		
	}
}

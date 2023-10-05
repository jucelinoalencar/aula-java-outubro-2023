package algoritimos.io;

public class A01_variaveis {

	public static void main(String[] args) {
		
		/* CLASSE EXPLICATIVA
		 *
		 */
		final String PRIMEIRO_NOME = "Jucelino";
		
		String nome = "Osvaldo";
		int idade = 36;
		float altura = 1.63f;
		double peso = 79.2;
		boolean ehDoadorDeSangue = true;
		char tipoSanguineo = 'A';
		char fatorRh = '+';
		
		System.out.println("nome: "+nome);
		System.out.println(idade);
		System.out.println(altura);
		System.out.println(peso);
		System.out.println(ehDoadorDeSangue);
		System.out.print(tipoSanguineo);
		System.out.println(fatorRh);
		System.out.printf("nome: %s\n",nome);
		System.out.printf("idade: %d\n",idade);
		System.out.printf("nome: %s\n",PRIMEIRO_NOME);
		System.out.printf("doador?: %b\n",ehDoadorDeSangue);
		System.out.printf("altura: %.2f\n",altura);
	}
	
			
}

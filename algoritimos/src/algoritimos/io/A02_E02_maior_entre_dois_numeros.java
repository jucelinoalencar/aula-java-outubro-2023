package algoritimos.io;

public class A02_E02_maior_entre_dois_numeros {

	public static void main(String[] args) {

         int n01 = 4, n02 = 25, n03 = 3;
		
		int m = ((n01 + n02) + Math.abs(n01 - n02)) / 2;

		int maior = ((m + n03) + Math.abs(m - n03)) /2;
		
		System.out.println(maior);
		
		/**
		int n01 = 1, n02 = 10, n03 = 100;
		int r01 = n01 >= n02 ?  n01 : n02;
		int r02 = r01 >= n03 ? r01 : n03;
	   System.out.println(resultado);
	   **/

	}

}

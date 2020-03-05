
public class Exercicio {
	
	public static int somar(int numA, int numB) {
		
		return numA + numB;
	}
	
	public static int proximo(int numA) {
		
		return somar(numA, 1);
	}
	
	public static int dobro(int numA) {
		
		return numA * 2;
	}
	
	public static void main(String[] args) {
		
		int soma = somar(2, 3);
		
		int rprox = proximo(3);
		
		int rdobro = dobro (4);
		
		System.out.println("O resultado da soma é " + soma + ", o próximo número é " + rprox + ", e o dobro do número é " + rdobro);
	}

}

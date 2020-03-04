
public class Exemplos {
	
	public static void main(String[] args) {
		
		ehMaiorIdade(9);
		
		ehMaiorIdade(30);
		
		classificar(0);
		}	
	
	
	public static void ehMaiorIdade(int idade) {
		if (idade >= 18) {
			System.out.println("Maior de Idade");
		}else {
			System.out.println("Menor de Idade");
		}
	}

	public static void classificar(int num) {
		
		if (num > 0) {
			System.out.println("Positivo");
		}else if (num < 0) {
			System.out.println("Negativo");
		}else {
			System.out.println("Zero");
		}
		
		
	}
	
	
	
	
	
	
	
}

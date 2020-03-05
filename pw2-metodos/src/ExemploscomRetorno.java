
public class ExemploscomRetorno {

	public static String concatenar(String nome, String sobrenome) {
		
		return nome + " " + sobrenome;
	}
	
	public static int tamanhoNomeCompleto(String nome, String sobrenome) {
		
		String nomeCompleto = concatenar (nome, sobrenome);
		
		return nomeCompleto.length();
	}
	
	public static void main(String[] args) {
		
		String nome = concatenar("Marco", "Royo");
		int tamanho = tamanhoNomeCompleto("Marco", "Royo");
		
		System.out.println("Nome: " + nome);
		System.out.println("Qtde: " + tamanho + " caracteres");
	}
}

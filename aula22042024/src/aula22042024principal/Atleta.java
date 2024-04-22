package aula22042024principal;
import java.util.Objects;

public class Atleta {
	String Fone;
	String Nome;
	String Apelido;
	String dataNascimento;
	int pontuacaoAcumulada;
	
	public Atleta(String FoneNovo, String NomeNovo, String dataNascimentoNovo, int pontuacaoAcumuladaNovo) {
		Fone = FoneNovo;
		Nome = NomeNovo;
		dataNascimento = dataNascimentoNovo;
		pontuacaoAcumulada = pontuacaoAcumuladaNovo;
		String[] partesNome = NomeNovo.split(" ");
		Apelido = partesNome[0];
	}
	
	public Atleta(String FoneNovo, String NomeNovo, String ApelidoNovo, String dataNascimentoNovo, int pontuacaoAcumuladaNovo) {
		Fone = FoneNovo;
		Nome = NomeNovo;
		Apelido = ApelidoNovo;
		dataNascimento = dataNascimentoNovo;
		pontuacaoAcumulada = pontuacaoAcumuladaNovo;
	}
}

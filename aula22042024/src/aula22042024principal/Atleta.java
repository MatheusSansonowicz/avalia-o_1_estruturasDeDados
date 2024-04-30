package aula22042024principal;

import java.util.Objects;

public class Atleta {
	    private String nome;
	    private String telefone;
	    private String dataNascimento;
	    private int pontuacaoAcumulada;
	    private String Apelido;
	    
	    public Atleta(String nome, String telefone, String dataNascimento, int pontuacaoAcumulada, String Apelido) {
			this.Apelido=Apelido;
			this.nome =nome;
			this.dataNascimento = dataNascimento;
			this.telefone = telefone;
			this.pontuacaoAcumulada = pontuacaoAcumulada;
		}
	    
	    public Atleta() {
	    }
	    
	    public String getApelido() {
			return Apelido;
		}
	    public String getDataNascimento() {
			return dataNascimento;
		}
	    public String getNome() {
			return nome;
		}
	    public int getPontuacaoAcumulada() {
			return pontuacaoAcumulada;
		}
	    public String getTelefone() {
			return telefone;
		}
	    
	    public void setApelido(String apelido) {
			Apelido = apelido;
		}
	    public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
	    public void setNome(String nome) {
			this.nome = nome;
		}
	    public void setPontuacaoAcumulada(int pontuacaoAcumulada) {
			this.pontuacaoAcumulada = pontuacaoAcumulada;
		}
	    public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
	    
	    @Override
	    public int hashCode() {
	        return Objects.hash(telefone);
	    }
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        Atleta other = (Atleta) obj;
	        return Objects.equals(telefone, other.telefone);
	    }
	    public String toString() {
	        return "Atleta:" +"nome='" + nome +", telefone='" + telefone +", dataNascimento='" + dataNascimento +", pontuacaoAcumulada=" + pontuacaoAcumulada +", apelido='" + Apelido + '\'';
	    }
	    
}

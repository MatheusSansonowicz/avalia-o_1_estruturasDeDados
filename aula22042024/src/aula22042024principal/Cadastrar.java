package aula22042024principal;

import java.util.Scanner;

public class Cadastrar {
	public static void Cadastrar(Scanner teclado) {
	    String nome;
	    String telefone;
	    String dataNascimento;
	    int pontuacaoAcumulada;
	    String Apelido;
	    boolean telefoneExistente;
	    
	    System.out.println("Digite o nome do atleta:");
        nome = teclado.nextLine();
        
	    do {
	        
	        
	        System.out.println("Digite o telefone do atleta:");
	        telefone = teclado.nextLine();
	        
	        telefoneExistente = false;
	        for (Atleta atleta : listaAtletas) {
	            if (atleta.Fone.equals(telefone)) {
	                telefoneExistente = true;
	                break;
	            }
	        }
	        
	        if (telefoneExistente) {
	            System.out.println("Atleta com o mesmo telefone já cadastrado. Por favor, digite outro número de telefone.");
	        }
	    } while (telefoneExistente);
	    System.out.println("Digite o apelido do atleta:");
        apelido = teclado.nextLine();
        if (apelido==null) {
        	String[] partesNome = nome.split(" ");
    		Apelido = partesNome[0];
        }
	    System.out.println("Digite a data de nascimento do atleta:");
	    dataNascimento = teclado.nextLine();
	    
	    System.out.println("Digite a pontuação acumulada do atleta:");
	    pontuacaoAcumulada = teclado.nextInt();
	    
	    Atleta novoAtleta = new Atleta(telefone, nome, dataNascimento, pontuacaoAcumulada);
	    listaAtletas.add(novoAtleta);
	    
	    System.out.println("Atleta cadastrado com sucesso!");
	}


}

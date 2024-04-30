package aula22042024principal;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Principal {
    
    private static List<Atleta> listaAtletas = new ArrayList<>();
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        try {
        System.out.println("-----MENU-----");
        System.out.println("1-LISTAR ATLETAS.");
        System.out.println("2-CADASTRAR ATLETA.");
        System.out.println("3-PROCURAR POR ATLETA.");
        System.out.println("3-REMOVER ATLETA.");
        System.out.println("\n Opcao: ");
        int opcao = Integer.parseInt(teclado.nextLine());
        teclado.nextLine();
        
        switch(opcao) {
            case 1:
                Listar();
                break;
            case 2: 
                Cadastrar();
                
                break;
            case 3:
                Find();
                break;
            case 4:
                Remover();
                break;
            default:
            	 throw new NumberFormatException();
        }
        } catch (NumberFormatException e) {
        	System.out.println("Digite uma opcao válida!");
        }
    }
  

    public static void Cadastrar() {
    	
    	String nome;
    	String telefone;
    	String dataNascimento;
    	String Apelido;
    	int pontuacaoAcumulada;
    	
    	boolean telefoneExistente;
    	
    	System.out.println("Digite o nome do atleta:");
        nome = teclado.nextLine();
            
    	    do {
    	        System.out.println("Digite o telefone do atleta:");
    	        telefone = teclado.nextLine();
    	        
    	        telefoneExistente = false;
    	        for (Atleta atleta : listaAtletas) {
    	            if (atleta.getTelefone().equals(telefone)) {
    	                telefoneExistente = true;
    	                break;
    	            }
    	        }
    	        
    	        if (telefoneExistente) {
    	            System.out.println("Atleta com o mesmo telefone já cadastrado. Por favor, digite outro número de telefone.");
    	        }
    	    } while (telefoneExistente);
    	    System.out.println("Digite o apelido do atleta:");
    	    Apelido = teclado.nextLine();
    	    if (Apelido == null || Apelido.isEmpty()) {
    	        String[] partesNome = nome.split(" ");
    	        Apelido = partesNome[0];
    	    }

    	    System.out.println("Digite a data de nascimento do atleta:");
    	    dataNascimento = teclado.nextLine();
    	    
    	    System.out.println("Digite a pontuação acumulada do atleta:");
    	    pontuacaoAcumulada = teclado.nextInt();
    	    
    	    Atleta novoAtleta = new Atleta();
    	    novoAtleta.setNome(nome);
    	    novoAtleta.setTelefone(telefone);
    	    novoAtleta.setDataNascimento(dataNascimento);
    	    novoAtleta.setPontuacaoAcumulada(pontuacaoAcumulada);
    	    novoAtleta.setApelido(Apelido);
    	    listaAtletas.add(novoAtleta);
    	    
    	    System.out.println("Atleta cadastrado com sucesso!");
    	    
    	}
    
	public static void Listar() {
        if (listaAtletas.isEmpty()) {
            System.out.println("Não há atletas cadastrados.");
            return;
        } else {
            System.out.println("Lista de Atletas:");
            for (Atleta atleta : listaAtletas) {
            	atleta.toString();
            	return;
            }
        }
        
    }
    
    public static void Find(){
    	if (listaAtletas.isEmpty()) {
            System.out.println("Não há atletas cadastrados.");
        } else {
        	System.out.println("Digite o nome/apelido do atleta que procura: ");
        	String procurado = teclado.nextLine();
        	for (Atleta atleta : listaAtletas) {
        		if (procurado == atleta.getNome() || procurado == atleta.getApelido()) {
        			atleta.toString();
        		}
        	}
        }
    	}

    public static void Remover() {
        if (listaAtletas.isEmpty()) {
            System.out.println("Não há atletas cadastrados.");
        } else {
            
            System.out.println("Digite o NOME COMPLETO do atleta que deseja remover: ");
            String procurado = teclado.nextLine();
            
            boolean encontrado = false;
            for (Atleta atleta : listaAtletas) {
                if (procurado.equals(atleta.getNome()) || procurado.equals(atleta.getApelido())) {
                    System.out.println("Deseja excluir: " + atleta.getNome() + " conhecido como: " + atleta.getApelido() + "? (1-sim, 2-não)");
                    int opcaoE = teclado.nextInt();
                    if (opcaoE == 1) {
                        listaAtletas.remove(atleta);
                        System.out.println("Atleta removido com sucesso.");
                    } else {
                        System.out.println("Operação cancelada.");
                    }
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Atleta não encontrado.");
            }
        }
    }
}

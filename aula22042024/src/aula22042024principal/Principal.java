package aula22042024principal;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Principal {
    
    private static List<Atleta> listaAtletas = new ArrayList<>();
    Scanner teclado = new Scanner(System.in);
    
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
        } catch (numberFormatException e) {
        	System.out.println("Digite uma opcao válida!");
        }
    }
  

    public static void Listar() {
        if (listaAtletas.isEmpty()) {
            System.out.println("Não há atletas cadastrados.");
        } else {
            System.out.println("Lista de Atletas:");
            for (Atleta atleta : listaAtletas) {
                System.out.println(atleta.Nome + " Telefone: " + atleta.Fone + " Pontuação total: " + atleta.pontuacaoAcumulada); 
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
        		if (procurado == atleta.Nome || procurado == atleta.Apelido) {
        			System.out.println(atleta.Nome +"conhecido como: " +atleta.Apelido + " | Telefone: " + atleta.Fone + " | Pontuação total: " + atleta.pontuacaoAcumulada);
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

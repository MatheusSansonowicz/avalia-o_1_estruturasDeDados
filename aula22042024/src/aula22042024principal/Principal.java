package aula22042024principal;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Principal {
    
    private static List<Atleta> listaAtletas = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
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
    
    

}

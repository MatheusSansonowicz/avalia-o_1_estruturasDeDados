package aula22042024principal;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class Principal {
	
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		private static Set<Atleta> conjuntoAtletas = new HashSet<>();
		
		System.out.println("-----MENU-----");
		System.out.println("1-LISTAR ATLETAS.");
		System.out.println("2-CADASTRAR ATLETA.");
		System.out.println("3-PROCURAR POR ATLETA.");
		System.out.println("3-REMOVER ATLETA.");
		System.out.println("\n Opcao: ");
		int opcao = teclado.nextInt();
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
			System.out.println("Digite uma opcao válida!");
			break;
		}
	}

	private static void Listar() {
		// TODO Auto-generated method stub
		
	}
}

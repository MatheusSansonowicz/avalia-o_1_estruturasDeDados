package aula22042024principal;

import java.util.Set;
import java.util.TreeSet;

public class Listar {
	public static void Listar() {
	boolean listando = true;
    while (listando) {
        System.out.println("Ordenar por:\n1-Nome.\n2-Pontuacao.\n3-Cancelar");
        int opcaoListagem = teclado.nextInt();
        
        switch(opcaoListagem) {
            case 1:
                ListarNome();
                break;
            case 2: 
                ListarPontos();
                break;
            case 3:
                System.out.println("Retornando...");
                listando = false;
                break;
            default:
                System.out.println("Digite uma opcao válida!");
                break;
        }
    }
}
	private static void ListarNome() {
    Set<Atleta> conjuntoOrdenadoPorNome = new TreeSet<>(new ComparadorNome());
    conjuntoOrdenadoPorNome.addAll(conjuntoAtletas);
    
    System.out.println("Lista de Atletas (Ordenado por Nome):");
    for (Atleta atleta : conjuntoOrdenadoPorNome) {
        System.out.println(atleta.Nome);
    }
}
	private static void ListarPontos() {
    Set<Atleta> conjuntoOrdenadoPorPontuacao = new TreeSet<>(new ComparadorPontuacao());
    conjuntoOrdenadoPorPontuacao.addAll(conjuntoAtletas);
    
    System.out.println("Lista de Atletas (Ordenado por Pontuação):");
    for (Atleta atleta : conjuntoOrdenadoPorPontuacao) {
        System.out.println(atleta.Nome + " - Pontuação: " + atleta.pontuacaoAcumulada);
    }
}

}

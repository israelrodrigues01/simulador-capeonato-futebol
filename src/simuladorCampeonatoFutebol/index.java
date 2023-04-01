package simuladorCampeonatoFutebol;

import java.util.ArrayList;
import java.util.Scanner;

public class index {

	public static void main (String[] args) {
		
		// Libs
		Scanner input = new Scanner(System.in);
		
		// Objetos
		Ingremento id = new Ingremento();
		ArrayList<Clube> clubes = new ArrayList<Clube>();
		
		// Index
		System.out.print("Quantidade de Clubes? ");
		int qtdClubes = input.nextInt();
		
		for(int i = 0; i < qtdClubes; i++) {
			System.out.print("Nome do clube-"+(i + 1)+": ");
			String nome = input.next();
			
			Clube clube_i = new Clube(nome);
			int numero = id.incremento();
			
			clube_i.idIngrement(numero);
			
			clubes.add(clube_i);
		}
		
		Campeonato campeonato = new Campeonato(clubes);	
		campeonato.jogarCampeonato();
		
		String teste = campeonato.getClassificacao();
		String capeao = campeonato.getCampeao();
		
		System.out.println("relre: " + teste);
		System.out.println(capeao);
		
		clubes.clear();
		input.close();
	}
	
}

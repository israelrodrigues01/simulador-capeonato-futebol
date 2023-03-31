package simuladorCampeonatoFutebol;

import java.util.Scanner;
import java.util.ArrayList;

public class index {

	public static void main (String[] args) {
		
		// Libs
		Scanner input = new Scanner(System.in);
		ArrayList<Clube> clubes = new ArrayList<Clube>();
		
		// Objetos
		Ingremento id = new Ingremento();
		
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
		
		System.out.println(campeonato);
		
		
		clubes.clear();
		input.close();
	}
	
}

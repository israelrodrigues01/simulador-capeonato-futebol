package simuladorCampeonatoFutebol;

import java.util.ArrayList;
import java.util.Scanner;

public class index {

	public static void main (String[] args) {
		
		// Libs
		Scanner input = new Scanner(System.in);
		
		// Objetos
		Ingremento id = new Ingremento();
		Verificacoes verificar = new Verificacoes();
		ArrayList<Clube> clubes = new ArrayList<Clube>();
		
		// Index
		System.out.print("Quantidade de Clubes? ");
		int qtdClubes = input.nextInt();
		
		for(int i = 0; i < qtdClubes; i++) {
			System.out.print("Nome do clube-"+(i + 1)+": ");
			String nome = input.next();
			
			if(!verificar.nomeIgual(clubes, nome)) {
				Clube clube_i = new Clube(nome);
				int numero = id.incremento();
				
				clube_i.idIngrement(numero);
				
				clubes.add(clube_i);					
			}else {
				System.out.println("Nome iguais, tente novamente");
				i -= 1;
			}	
		}
		
		Campeonato campeonato = new Campeonato(clubes);	
		campeonato.jogarCampeonato();
		
		String classificacao = campeonato.getClassificacao();
		String capeao = campeonato.getCampeao();
		
		System.out.println("\n\n============= Classificacao ===============\n\n");
		System.out.println(classificacao);
		System.out.println("\n\n============= Classificacao ===============");
		
		System.out.println("\n\n============= Campeao ===============\n\n");
		System.out.println(capeao);
		System.out.println("\n\n============= Capeao ===============");
		
		clubes.clear();
		input.close();
	}
	
}

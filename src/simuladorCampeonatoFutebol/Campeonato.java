package simuladorCampeonatoFutebol;

import java.util.ArrayList;
import java.util.Random;

public class Campeonato {
	
	ArrayList<Clube> clubes = new ArrayList<Clube>();
	
	Random random = new Random();
	
	public Campeonato(ArrayList<Clube> clubes) {
		this.clubes = clubes;
	}
	
	void jogarCampeonato(){
		System.out.println("============= Assistir jogos ===============\n");
		for(Clube clubeOne : clubes) {
			for(Clube clubeTwo : clubes) {
				if(clubeOne.getId() != clubeTwo.getId()) {
					this.jogarPartida(clubeOne, clubeTwo);
				}
			}
		}
		System.out.println("\n============= Fim dos jogos ===============");
	}
	
	void jogarPartida(Clube clubeOne, Clube clubeTwo) {
		int golsTimeOne = random.nextInt(5);
		int golsTimeTwo = random.nextInt(5);
		
		if(golsTimeOne == golsTimeTwo) {
			clubeOne.empate();
			clubeTwo.empate();
			System.out.println("\nEmpate em: " + clubeOne.getNome() + " e " + clubeTwo.getNome());
		}else if(golsTimeOne < golsTimeTwo) {
			clubeOne.perder(golsTimeOne, golsTimeTwo);
			clubeTwo.ganhar(golsTimeTwo, golsTimeOne);
			System.out.println("\nTime perdeu: " + clubeOne.getNome() + ", time ganhou: " + clubeTwo.getNome());
		}else if(golsTimeOne > golsTimeTwo) {
			clubeOne.ganhar(golsTimeOne, golsTimeTwo);
			clubeTwo.perder(golsTimeTwo, golsTimeOne);
			System.out.println("\nTime ganhou: " + clubeOne.getNome() + ", time perdeu: " + clubeTwo.getNome());
		}
	}
	
	public String getClassificacao(){		
		int totals = this.clubes.size();
		Clube reserva;
		
		//	Ordenando array
		
		for(int i = 0; i < totals; i++) {
			for(int j = 0; j < totals - 1; j++) {
				Clube valorOne = clubes.get(j);
				Clube valorTwo = clubes.get(j+1);
				if(valorOne.getPontos() < valorTwo.getPontos()) {
					reserva = clubes.get(j);
					clubes.set(j, clubes.get(j+1));
					clubes.set(j+1, reserva);
				}else if(valorOne.getPontos() == valorTwo.getPontos()) {
					if(valorOne.getSaldoGols() < valorTwo.getSaldoGols()) {
						reserva = clubes.get(j);
						clubes.set(j, clubes.get(j+1));
						clubes.set(j+1, reserva);
					}
				}
			}
		}
		
		String resultado = "------------------------------------------------\n";
		
		for(Clube time: clubes) {
			resultado += 
					"Time: " + time.getNome() + " Pontuacao: " + time.getPontos() + " Saldo de Gols: " + time.getSaldoGols() +
					"\n------------------------------------------------\n";
		}
		
		return resultado;
	}
	
	public String getCampeao() {
		Clube capeao = clubes.get(0);
		String resultado = "Meus parabens " + capeao.getNome() + ", voce foi o nosso campeao!!!!";
		return resultado;
	}
	
	public String toString() {
		String values = "Clubes: " + this.clubes;
		return values;
	}
	
}

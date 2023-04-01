package simuladorCampeonatoFutebol;

import java.util.ArrayList;
import java.util.Random;
//import java.util.Arrays;
//import java.util.Collections;

public class Campeonato {
	
	ArrayList<Clube> clubes = new ArrayList<Clube>();
	
	Random random = new Random();
	
	public Campeonato(ArrayList<Clube> clubes) {
		this.clubes = clubes;
	}
	
	void jogarCampeonato(){
		for(Clube clubeOne : clubes) {
			for(Clube clubeTwo : clubes) {
				if(clubeOne.id != clubeTwo.id) {
					this.jogarPartida(clubeOne, clubeTwo);
				}
			}
		}
	}
	
	void jogarPartida(Clube clubeOne, Clube clubeTwo) {
		int golsTimeOne = random.nextInt(5);
		int golsTimeTwo = random.nextInt(5);
		
		if(golsTimeOne == golsTimeTwo) {
			clubeOne.empate();
			clubeTwo.empate();
			System.out.println("\nEmpate em: " + clubeOne.nome + " e " + clubeTwo.nome);
		}else if(golsTimeOne < golsTimeTwo) {
			clubeOne.perder(golsTimeOne, golsTimeTwo);
			clubeTwo.ganhar(golsTimeTwo, golsTimeOne);
			System.out.println("\nTime perdeu: " + clubeOne.nome + ", time ganhou: " + clubeTwo.nome);
		}else if(golsTimeOne > golsTimeTwo) {
			clubeOne.ganhar(golsTimeOne, golsTimeTwo);
			clubeTwo.perder(golsTimeTwo, golsTimeOne);
			System.out.println("\nTime ganhou: " + clubeOne.nome + ", time perdeu: " + clubeTwo.nome);
		}
	}
	
	public String getClassificacao(){
		String resultado = "";
		
		int totals = this.clubes.size();
		Clube reserva;
		
		//	Ordenando array
		
		for(int i = 0; i < totals; i++) {
			for(int j = 0; j < totals - 1; j++) {
				Clube valorOne = clubes.get(j);
				Clube valorTwo = clubes.get(j+1);
				if(valorOne.pontos < valorTwo.pontos) {
					reserva = clubes.get(j);
					clubes.set(j, clubes.get(j+1));
					clubes.set(j+1, reserva);
				}else if(valorOne.pontos == valorTwo.pontos) {
					if(valorOne.saldoGols < valorTwo.saldoGols) {
						reserva = clubes.get(j);
						clubes.set(j, clubes.get(j+1));
						clubes.set(j+1, reserva);
					}
				}
			}
		}
		
		for(Clube time: clubes) {
			resultado += "\n\nTime: " + time.nome + " Pontuacao: " + time.pontos + " Saldo de Gols: " + time.saldoGols;
		}
		
		return resultado;
	}
	
	public String getCampeao() {
		Clube capeao = clubes.get(0);
		String resultado = "Meus parabens " + capeao.nome+ ", voce foi o nosso campeao!!!!";
		return resultado;
	}
	
	public String toString() {
		String values = "Clubes: " + this.clubes;
		return values;
	}
	
}

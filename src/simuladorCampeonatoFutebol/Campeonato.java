package simuladorCampeonatoFutebol;

import java.util.ArrayList;

public class Campeonato {
	
	ArrayList<Clube> clubes = new ArrayList<Clube>();
	
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
		
	}
	
	void getClassificacao(){
		
	}
	
	void getCampeao() {
		
	}
	
	public String toString() {
		String values = "Clubes: " + this.clubes;
		return values;
	}
	
}

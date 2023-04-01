package simuladorCampeonatoFutebol;

public class Clube {
	int id;
	String nome;
	int pontos = 0;
	int saldoGols = 0;
	
	public Clube(String nome) {
		this.nome = nome;
	}
	
	void idIngrement(int id) {
		this.id = id;
	}
	
	void ganhar(int golsFeitos, int golsSofridos) {
		int gols = golsFeitos - golsSofridos;
		this.saldoGols += gols;
		this.pontos += 3;
	}
	
	void empate() {
		this.pontos += 1;
	}
	
	void perder(int golsFeitos, int golsSofridos) {
		int gols = golsFeitos - golsSofridos;
		this.saldoGols += gols;
	}
	
	public int getPontos() {
		return this.pontos;
	}
	
	public int getSaldoGols() {
		return this.saldoGols;
	}
	
	public String toString() {
		String values =
				"id: " + id +
				"\nNome do time: " + this.nome + 
				"\nPontos: " + this.pontos +
				"\nSaldo de Gols: " + this.saldoGols +
				"\n\n\n";
		return values;
	}
}

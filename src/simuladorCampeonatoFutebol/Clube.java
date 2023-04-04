package simuladorCampeonatoFutebol;

public class Clube {
	private int id;
	private String nome;
	private int pontos = 0;
	private int saldoGols = 0;

	public Clube(String nome) {
		this.nome = nome;
	}

	void idIncrement(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
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
		String values = "id: " + id +
				"\nNome do time: " + this.nome +
				"\nPontos: " + this.pontos +
				"\nSaldo de Gols: " + this.saldoGols +
				"\n\n\n";
		return values;
	}
}

package simuladorCampeonatoFutebol;

public class Clube {
	String nome;
	int pontos = 0;
	int saldoGols = 0;
	
	public Clube(String nome) {
		this.nome = nome;
	}
	
	void ganhar(int saldoGols) {
		this.saldoGols += saldoGols;
	}
	
	void empatar() {}
	
	void perder() {}
	
	public String toString() {
		String values = 
				"Nome do time: " + this.nome + 
				"\nPontos: " + this.pontos +
				"\nSaldo de Gols: " + this.saldoGols;
		return values;
	}
}

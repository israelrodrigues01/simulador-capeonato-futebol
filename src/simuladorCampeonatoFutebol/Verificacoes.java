package simuladorCampeonatoFutebol;

public class Verificacoes {
	
	public boolean nomeIgual(Clube [] clube, String nome) {
		for(Clube c: clube) {
			if(c.nome.equals(nome)) {
				return false;
			}
		}
		return true;
	}
	
}

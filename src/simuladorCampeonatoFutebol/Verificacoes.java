package simuladorCampeonatoFutebol;

import java.util.ArrayList;

public class Verificacoes {
	
	public boolean nomeIgual(ArrayList<Clube> clubes, String nome) {
		for(Clube c: clubes) {
			if(c.nome.equals(nome)) {
				return true;
			}
		}
		return false;
	}
	
}

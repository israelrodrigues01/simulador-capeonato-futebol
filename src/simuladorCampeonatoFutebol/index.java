package simuladorCampeonatoFutebol;

public class index {

	public static void main (String[] args) {
		Clube one = new Clube("Israel");
		Clube one2 = new Clube("Israel");
		Campeonato capeonato = new Campeonato(one);
		one.ganhar(1);
		one.ganhar(1);
		System.out.println(capeonato);
	}
	
}

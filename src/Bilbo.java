import java.util.Arrays;
import java.util.LinkedList;

public class Bilbo {
	private Skarby skarby = new Skarby();
	
	public void rozdziel(Skarb[] skarby, Krasnolud[] krasnoludy, Worek[] worki){
		rozstawWorki(krasnoludy, worki);
		
		LinkedList<Skarb> listaSkarbow = new LinkedList<>(Arrays.asList(skarby));
		
		while(!listaSkarbow.isEmpty()){
			for(int i = 0; i < krasnoludy.length; i++){
				boolean koniec = false;
				while(!listaSkarbow.isEmpty() && krasnoludy[i].czyChceszSkarb() && !koniec){
					if(worki[i].czyPomiesci(listaSkarbow.getFirst())){
						worki[i].dodaj(listaSkarbow.getFirst());
					}
					else{
						zabierzSkarby(worki[i]);
						zabierzSkarb(listaSkarbow.getFirst());
						koniec = true;
					}
					listaSkarbow.removeFirst();
				}
			}
			przekazZawartosc(krasnoludy, worki);
		}
		wypiszRezultat(krasnoludy);
	}
	private void wypiszRezultat(Krasnolud[] krasnoludy){
		System.out.println("Wynik:");
		for(int i = 0; i < krasnoludy.length; i++){
			System.out.println("Krasnolud " + i + ": ");
			krasnoludy[i].wypiszSkarby();
		}
	}
	private void zabierzSkarby(Worek worek){
		skarby.dodaj(worek.oproznij());
	}
	private void zabierzSkarb(Skarb skarb){
		skarby.dodaj(skarb);
	}
	private void rozstawWorki(Krasnolud[] krasnoludy, Worek[] worki){
		for(int i = 0; i < krasnoludy.length; i++){
			krasnoludy[i].setWidokWorkow(new OdpowiedziBilbo(worki, i));
		}
	}
	private void przekazZawartosc(Krasnolud[] krasnoludy, Worek[] worki){
		for(int i = 0; i < krasnoludy.length; i++){
			krasnoludy[i].dodaj(worki[i].oproznij());
		}
	}
}

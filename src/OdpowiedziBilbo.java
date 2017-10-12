
public class OdpowiedziBilbo {
	private WidokWorka[] worki;
	private int numerWorka;
	
	public OdpowiedziBilbo(Worek[] worki, int numerWorka){
		this.worki = new WidokWorka[worki.length];
		for(int i = 0; i < worki.length; i++){
			this.worki[i] = new WidokWorka(worki[i]);
		}
		this.numerWorka = numerWorka;
	}
	public int ileWorkow(){
		return worki.length;
	}
	public WidokWorka daj(int numer){
		return worki[numer];
	}
	public WidokWorka dajMoj(){
		return worki[numerWorka];
	}
}

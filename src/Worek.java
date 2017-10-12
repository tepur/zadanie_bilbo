
public class Worek {
	private int pojemnosc;
	private int wypelnienie = 0;
	private Skarby skarby = null;
	
	public Worek(int pojemnosc){
		skarby = new Skarby();
		this.pojemnosc = pojemnosc;
	}
	
	public boolean czyPusty(){
		return (skarby == null);
	}
	public boolean czyPomiesci(Skarb s){
		return ((pojemnosc - wypelnienie) >= s.rozmiar());
	}
	public void dodaj(Skarb s){
		wypelnienie += s.rozmiar();
		skarby.dodaj(s);
	}
	public Skarby oproznij(){
		wypelnienie = 0;
		Skarby zwracaneSkarby = skarby;
		skarby = new Skarby();
		return zwracaneSkarby;
	}
	public int ileSkarbow(){
		return skarby.ilosc();
	}
	public int wypelnienie(){
		return wypelnienie;
	}
	public int pojemnosc(){
		return pojemnosc;
	}
	@Override
	public String toString(){
		return "Pojemnosc: " + pojemnosc + ", wypelnienie: " + wypelnienie + ", skarby: " + skarby;
	}
}

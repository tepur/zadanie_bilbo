public class Skarb {
	private int rozmiar = 0;
	
	public Skarb(int rozmiar){
		this.rozmiar = rozmiar;
	}
	
	public int rozmiar(){
		return rozmiar;
	}
	@Override
	public String toString(){
		return "rozmiar: " + rozmiar;
	}
}

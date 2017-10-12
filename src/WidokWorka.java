
public class WidokWorka {
	private Worek worek;
	
	public WidokWorka(Worek worek){
		this.worek = worek;
	}
	public int ileSkarbow(){
		return worek.ileSkarbow();
	}
	public int wypelnienie(){
		return worek.wypelnienie();
	}
	public int pojemnosc(){
		return worek.pojemnosc();
	}
}

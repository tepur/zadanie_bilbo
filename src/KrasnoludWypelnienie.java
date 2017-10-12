
public class KrasnoludWypelnienie extends Krasnolud {
	private double procent;
	
	public KrasnoludWypelnienie(double procent){
		this.procent = procent;
	}
	public boolean czyChceszSkarb(){
		if(widokWorkow.dajMoj().wypelnienie() == 0){
			return true;
		}
		return (((widokWorkow.dajMoj().wypelnienie() * 100.0f) / widokWorkow.dajMoj().pojemnosc()) < procent);
	}
}

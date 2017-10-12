public class KrasnoludStatystyk extends Krasnolud {
	public boolean czyChceszSkarb(){
		if(policzSkarby() == 0){
			return true;
		}
		float przewidywany = policzPojemnoscRozdanych() / policzSkarby();
		return (widokWorkow.dajMoj().pojemnosc() - widokWorkow.dajMoj().wypelnienie()) >= przewidywany;
	}
	private int policzPojemnoscRozdanych(){
		return widokWorkow.dajMoj().wypelnienie();
	}
	private int policzSkarby(){
		return widokWorkow.dajMoj().ileSkarbow();
	}
}

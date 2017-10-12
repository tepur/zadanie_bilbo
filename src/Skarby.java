import java.util.ArrayList;
import java.util.List;

public class Skarby {
	private List<Skarb> skarby = new ArrayList<>();
	
	public void dodaj(Skarb s){
		skarby.add(s);
	}
	public void dodaj(Skarby s){
		skarby.addAll(s.skarby);
	}
	@Override
	public String toString(){
		return skarby.toString();
	}
	public int ilosc(){
		return skarby.size();
	}
}

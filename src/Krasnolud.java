
public abstract class Krasnolud {
	protected Skarby skarby = new Skarby();
	protected OdpowiedziBilbo widokWorkow;
	
	abstract public boolean czyChceszSkarb();
	public void dodaj(Skarby skarby){
		this.skarby.dodaj(skarby);
	}
	public void setWidokWorkow(OdpowiedziBilbo widokWorkow){
		this.widokWorkow = widokWorkow;
	}
	public void wypiszSkarby(){
		System.out.println(skarby);
	}
}

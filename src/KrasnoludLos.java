import java.util.Random;

public class KrasnoludLos extends Krasnolud {
	private static Random moneta = new Random();
	public boolean czyChceszSkarb(){
		return (rzutMoneta() == 0);
	}
	private static int rzutMoneta(){
		return moneta.nextInt(2);
	}
}

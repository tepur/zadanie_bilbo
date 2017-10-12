
public class Main {
	
	public static void main(String[] args) {
		Bilbo bilbo = new Bilbo();
		
		Krasnolud[] krasnolud = new Krasnolud[7];
		
		krasnolud[0] = new KrasnoludStatystyk();
		krasnolud[1] = new KrasnoludWypelnienie(40.0f);
		krasnolud[2] = new KrasnoludWypelnienie(80.0f);
		for(int i = 3; i < 7; i++){
			krasnolud[i] = new KrasnoludLos();
		}
		
		Worek[] worek = new Worek[7];
		for(int i = 0; i < 7; i++){
			worek[i] = new Worek(10 + i * 2);
		}
		
		Skarb[] skarb = new Skarb[15];
		for(int i = 0; i < 15; i++){
			skarb[i] = new Skarb(i + 2);
		}
		
		bilbo.rozdziel(skarb, krasnolud, worek);
	}
}

package exercicio_1;

public class Incremental {
	private static final Incremental ins = new Incremental();
	private static int count = 0;
	private int numero;
	public Incremental() {
		numero = ++count;
	}
	public static Incremental getInstance() {
		return ins;
	}
	public String toString() {
		return "Incremental " + numero;
	} 
}

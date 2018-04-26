package exercicio_1;

public class TesteIncremental {

	public static void main(String[] args) { 
		for (int i = 0; i < 10; i++) {
			Incremental inc = new Incremental();
			inc.getInstance();
			System.out.println(inc);
			}
		}

}

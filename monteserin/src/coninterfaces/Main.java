package coninterfaces;

public class Main {

	public static void main(String[] args) {
		Perro perro = new Perro("guau");
		Vaca vaca = new Vaca("muuuuuu");

		Gato gato = new Gato("miu");
		
		System.out.println(Animal.sonidoMasLargo);
	}

}

package coninterfaces;

public class Animal implements IAnimal{
	static String sonidoMasLargo="";
	String sonido;
	
	Animal(String sonido){
		this.sonido = sonido;
		compararSonido();
	}

	@Override
	public void compararSonido() {
		if(sonido.length() > sonidoMasLargo.length()) {
			sonidoMasLargo = sonido;
		}
		
	}
}

package com.pablomonteserin.interfaces;

public class IReproducirAudio implements ReproducirAudio {

	@Override
	public void reproducirSonido(String url) {
		//SoundMaster s = new SoundMaster();
		// s.playSound(url);
		
		SoundPro s = new SoundPro();
		s.tocarSonido(url);
	}

}

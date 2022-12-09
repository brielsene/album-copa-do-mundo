package br.com.album.copa.modelo;

import java.util.ArrayList;
import java.util.List;

public class Album {
	private TipoAlbum tipoAlbum;
	private List<Figurinha> figurinhas = new ArrayList<Figurinha>();
	
	public Album(TipoAlbum tipoAlbum) {
		this.tipoAlbum = tipoAlbum;
	}
	
	public List<Figurinha> getFigurinhas() {
		return figurinhas;
	}
	
	public void adicionaFigurinha(Figurinha figurinha) {
		figurinhas.add(figurinha);
	}
	
	
	
	
	
	
	


	

}

package br.com.album.copa.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import br.com.album.copa.modelo.Album;
import br.com.album.copa.modelo.Figurinha;
import br.com.album.copa.modelo.TipoAlbum;

public class AlbumTeste {
	 @Test
	 public void deveRetornarToString() {
		 Album album = new Album(TipoAlbum.CAPA_DURA);
			// Instância nova figurinha
			Figurinha figurinha = new Figurinha("Lucas Paqueta", "Brasil", 7);
			album.adicionaFigurinha(figurinha);
			List<String> nome = album.getFigurinhas().stream().map(f -> f.getNome()).collect(Collectors.toList());
			String nomeJogador = nome.get(0);
			
			assertEquals("Lucas Paqueta",nomeJogador );
	 }
	 

}

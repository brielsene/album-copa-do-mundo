package br.com.album.copa.teste;

import java.util.stream.Collectors;

import br.com.album.copa.modelo.Album;
import br.com.album.copa.modelo.Figurinha;
import br.com.album.copa.modelo.TipoAlbum;

public class TesteAlbumDaCopa {

	public static void main(String[] args) {
		// Novo Album
		Album album = new Album(TipoAlbum.CAPA_DURA);

		// Instância nova figurinha
		Figurinha figurinha = new Figurinha("Lucas Paqueta", "Brasil", 7);
		album.adicionaFigurinha(figurinha);

		// Instância nova figurinha
		Figurinha figurinha2 = new Figurinha("Neymar", "Brasil", 10);
		album.adicionaFigurinha(figurinha2);

		// Instância nova figurinha
		Figurinha figurinha3 = new Figurinha("Modric", "Croatia", 10);
		album.adicionaFigurinha(figurinha3);

		System.out.println(album.getFigurinhas());
		album.getFigurinhas().sort((c1, c2)->c2.getSelecao().compareTo(c1.getSelecao()));
		System.out.println();
		System.out.println("Ordenados");
		System.out.println();
		System.out.println(album.getFigurinhas());
		System.out.println();
		album.getFigurinhas().sort((c1, c2)->c1.getSelecao().compareTo(c2.getSelecao()));
		
		album.getFigurinhas().forEach(System.out::println);
		
		album.getFigurinhas().stream().collect(Collectors.toMap(l -> l.getNome(), l ->l.getNumero()))
		.forEach((nome, selecao)->System.out.println("Nome: "+nome+", Seleção: "+selecao));;

	}

}

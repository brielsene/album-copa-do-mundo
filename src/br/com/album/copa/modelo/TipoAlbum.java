package br.com.album.copa.modelo;

import java.math.BigDecimal;

public enum TipoAlbum {
	CAPA_DURA{
		
		public String capaDura() {
			return "Capa Dura";
		}
		
	},
	CAPA_MOLE{
		
		public String capaMOLE() {
			return "Capa Mole";
		}
}

}

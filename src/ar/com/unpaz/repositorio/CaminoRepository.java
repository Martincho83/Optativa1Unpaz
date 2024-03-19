package ar.com.unpaz.repositorio;

import ar.com.unpaz.model.Camino;
import java.util.List;

public class CaminoRepository {
	public static void mostrarCaminos(List<Camino> caminos) {
		for(Camino camino : caminos) {
			System.out.println(camino);
		}
	}
}

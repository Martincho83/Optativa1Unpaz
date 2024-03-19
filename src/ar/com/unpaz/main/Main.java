package ar.com.unpaz.main;

import ar.com.unpaz.servicio.CaminoServicio;

public class Main {

	public static void main(String[] args) {
		CaminoServicio caminoServicio = new CaminoServicio();
		caminoServicio.mostrarCaminos();
	}
}
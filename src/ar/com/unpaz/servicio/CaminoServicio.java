package ar.com.unpaz.servicio;

import ar.com.unpaz.model.Camino;
import ar.com.unpaz.repositorio.CaminoRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CaminoServicio {
	private static final String FILE_PATH = "vial.csv";
	
	public void mostrarCaminos() {
		List<Camino> caminos = leerCaminoDesdeArchivo();
		CaminoRepository.mostrarCaminos(caminos);
	}
	
	private List<Camino> leerCaminoDesdeArchivo(){
		List<Camino> caminos = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))){
			String line;
			while((line = br.readLine()) !=null) {
				String[] data = line.split(",");
				int codigo = Integer.parseInt(data[0]);
				String tipo = data[1];
				int id = Integer.parseInt(data[2]);
				String nombre = data[3];
				int valor = Integer.parseInt(data[4]);
				Camino camino = new Camino(codigo, tipo, id, nombre, valor);
				caminos.add(camino);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return caminos;
	}

}

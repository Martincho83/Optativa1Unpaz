package ar.com.unpaz.model;

public class Camino {
	private int codigo;
	private String tipo;
	private int id;
	private String nombre;
	private int valor;

	public Camino(int codigo, String tipo, int id, String nombre, int valor) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.id = id;
		this.nombre = nombre;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Camino{" +
				"codigo=" + codigo +
				", tipo='" + tipo + '\'' +
				", id=" + id +
				", nombre='" + nombre + '\'' +
				", valor=" + valor +
				'}';
	}
}

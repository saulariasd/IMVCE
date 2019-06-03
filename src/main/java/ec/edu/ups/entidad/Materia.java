package ec.edu.ups.entidad;

public class Materia {
	private int id;
	private String codigo;
	private String nombre;

	public int getId() {
		return id;
	} 
	/**
	 * 
	 * @param id El parametro Id es el identificador unico para cada objeto de esta clase
	 */

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

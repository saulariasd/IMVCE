package ec.edu.ups.entidad;

/**
 * 
 * @author ASUS
 *
 */
public class Tutoria {

	private int id;
	private String descripcion;
	private Grupo grupo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

}

package ec.edu.ups.entidad;

public class Encuesta {
	private int id;
	private String descripcion;
	private MensajeGrupo grupo;
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
	public MensajeGrupo getGrupo() {
		return grupo;
	}
	public void setGrupo(MensajeGrupo grupo) {
		this.grupo = grupo;
	}
	
	
	

}

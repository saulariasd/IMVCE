package ec.edu.ups.entidad;

public class Encuesta {
	private int id;
	private String descripcion;
	private MensajeGrupo grupo;
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

package ec.edu.ups.entidad;

public class Encuesta {
	private int id;
	private String descripcion;
	private Mensaje mensaje;
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
	public Mensaje getMensaje() {
		return mensaje;
	}
	public void setGrupo(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	
	

}

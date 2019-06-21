package ec.edu.ups.entidad;

public class Notificaciones {
	
	private int id;
	private Mensaje mensaje;
	private String descripcion;
	private Tutoria tutoria;
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
	public Mensaje getMensaje() {
		return mensaje;
	}
	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Tutoria getTutoria() {
		return tutoria;
	}
	public void setTutoria(Tutoria tutoria) {
		this.tutoria = tutoria;
	}
	
	

}

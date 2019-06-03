package ec.edu.ups.entidad;

public class Notificaciones {
	
	private int id;
	private MensajeContacto contacto;
	private MensajeGrupo grupo;
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
	public MensajeContacto getContacto() {
		return contacto;
	}
	public void setContacto(MensajeContacto contacto) {
		this.contacto = contacto;
	}
	public MensajeGrupo getGrupo() {
		return grupo;
	}
	public void setGrupo(MensajeGrupo grupo) {
		this.grupo = grupo;
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

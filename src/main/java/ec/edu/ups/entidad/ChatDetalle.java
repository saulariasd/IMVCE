package ec.edu.ups.entidad;

import java.util.Date;

public class ChatDetalle {
	private int id;
	private MensajeContacto contacto;
	private MensajeGrupo grupo;
	private String descripcion;
	private Date hora;
	public int getId() {
		return id;
	}
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
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	

}

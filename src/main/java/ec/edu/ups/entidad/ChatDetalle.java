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
	/**
	 * 
	 * @param contacto el parametero contacto sirve para obtener el Identificador de la Clase MensajeContacto
	 */
	public void setContacto(MensajeContacto contacto) {
		this.contacto = contacto;
	}
	public MensajeGrupo getGrupo() {
		return grupo;
	}
	/**
	 * 
	 * @param grupo el parametero contacto sirve para obtener el Identificador de la Clase Grupo
	 */
	public void setGrupo(MensajeGrupo grupo) {
		this.grupo = grupo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * 
	 * @param descripcion el parametro descripcion sera en donde contendra cada campo de texto 
	 */
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

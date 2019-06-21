package ec.edu.ups.entidad;

import java.util.Date;

public class ChatDetalle {
	private int id;
	private Mensaje mensaje;
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
	public Mensaje getMensaje() {
		return mensaje;
	}
	/**
	 * 
	 * @param contacto el parametero contacto sirve para obtener el Identificador de la Clase MensajeContacto
	 */
	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
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

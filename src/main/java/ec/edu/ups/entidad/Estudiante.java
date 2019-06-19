package ec.edu.ups.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
public class Estudiante {
	@Id
	@GeneratedValue
	@NotNull
	private int id;
	private String nombre;
	private String telefono;
	@Size(min = 10, max = 10)
	private String cedula;
	@Email
	private String usuario;
	private String passwd;

	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id El parametro Id es el identificador unico para cada objeto de esta
	 *           clase
	 */

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}
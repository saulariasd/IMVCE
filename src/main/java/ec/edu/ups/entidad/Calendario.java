package ec.edu.ups.entidad;
/**
 * 
 * @author ASUS La Clase canlendario sirve para guardar los horarios correspondientes a los docente o estudiantes con sus respectivas materias
 *
 */

public class Calendario {
	private int id;
	private Grupo grupo;
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
	public Grupo getGrupo() {
		return grupo;
	}
	/**
	 * 
	 * @param grupo El parametro atributo hace referencia a la Clase grupo en donde se accedera para tener informacion 
	 */
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	

}

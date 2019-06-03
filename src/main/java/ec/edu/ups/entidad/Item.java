package ec.edu.ups.entidad;

/**
 * 
 * @author ASUS
 * 
 *         La clase Item servira para tener los detalles correspondientes a la
 *         clase encuestas
 * 
 *
 */

public class Item {
	private int id; 
	private String descripcion; 
	private Encuesta encuesta; 

	public int getId() {
		return id;
	}
	/**
	 * 
	 * @param id el atributo id se genera automaticamente siendo el identificador unico para
					 cada item
	 */

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * 
	 * @param descripcion el atributo descripcion tendra el valor de cada item de la encuesta
	 */

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Encuesta getEncuesta() {
		return encuesta;
	}
	/**
	 * 
	 * @param encuesta el atributo encuesta pertenece a la clase Encuesta en donde se guardara identificador unico de cada encuesta para cada Item
	 */

	public void setEncuesta(Encuesta encuesta) {
		this.encuesta = encuesta;
	}

}

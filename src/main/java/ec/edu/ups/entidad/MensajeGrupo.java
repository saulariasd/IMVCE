package ec.edu.ups.entidad;

public class MensajeGrupo {
	private int id;
	private String recptor;
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
	public String getRecptor() {
		return recptor;
	}
	public void setRecptor(String recptor) {
		this.recptor = recptor;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	
	

}

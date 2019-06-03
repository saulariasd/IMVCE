package ec.edu.ups.entidad;

public class EstudianteGrupo {
	private int id;
	private Estudiante estudiante;
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

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

}

package ec.edu.ups.presentacion;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ec.edu.ups.entidad.Estudiante;
import ec.edu.ups.negocio.EstudianteON;

@ManagedBean
public class EstudianteBean {
	private Estudiante estudiante = new Estudiante();
	private List<Estudiante> listEstudiante;
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public List<Estudiante> getListEstudiante() {
		return listEstudiante;
	}
	public void setListEstudiante(List<Estudiante> listEstudiante) {
		this.listEstudiante = listEstudiante;
	}
	
	@Inject
	private EstudianteON estudianteON;
	
	@PostConstruct
	public void init() {
		
	}
	public String cargarDatos() {
		try {
			estudianteON.guardarEstudiante(estudiante);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	

}

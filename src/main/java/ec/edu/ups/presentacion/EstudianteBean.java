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
	private String nombre;
	private List<Estudiante> listaFiltro;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

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
		listEstudiante = estudianteON.getEstudiante();
		//listaFiltro = estudianteON.getListEstudiantes(nombre);

	}

	public String cargarDatos() {
		try {
			estudianteON.guardarEstudiante(estudiante);
			init();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String modificar() {
		try {
			estudianteON.modificarEstudiante(estudiante);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String eliminar(int codigo) {
		try {
			estudianteON.eliminarEstudiante(codigo);
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
			e.printStackTrace();
		}
		return "listaEstudinte";
	}

	public String editar(int codigo) {
		estudiante = estudianteON.getEstudiante(codigo);
		return "estudiante";
	}

	public String guarModEstudiante() {
		try {
			estudianteON.guarModiEstudiante(estudiante);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}

package ec.edu.ups.negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.dao.EstudianteDao;
import ec.edu.ups.entidad.Estudiante;

@Stateless
public class EstudianteON {
	@Inject
	private EstudianteDao dao;

	public void guardarEstudiante(Estudiante estudiante) throws Exception {
		if (estudiante.getNombre().length() < 5) {
			throw new Exception("Dimension corata");
		} else {
			dao.insertarEstudiante(estudiante);
		}
	}

	public List<Estudiante> getEstudiante() {
		return dao.listaEstuidiantes();
	}

	public List<Estudiante> getListEstudiantes(String buscar) {
		return dao.listaEstuidiante(buscar);
	}

	public void modificarEstudiante(Estudiante estudiante) throws Exception {
		Estudiante estudiante2 = dao.readEstudiante(estudiante.getId());
		if (estudiante2 == null) {
			throw new Exception("No existe");
		} else {
			dao.updateEstudiante(estudiante);
		}
	}

	public void eliminarEstudiante(int codigo) throws Exception {
		try {
			dao.deleteEstudiante(codigo);
		} catch (Exception e) {
			throw new Exception("Error al borrar " + e.getMessage());
		}
	}

	public Estudiante getEstudiante(int codigo) {
		Estudiante aux = dao.readEstudiante(codigo);
		return aux;
	}
	public void guarModiEstudiante(Estudiante estudiante) throws Exception{
		if(estudiante.getNombre().length()<6) {
			throw new Exception("Dimension corta");
		}else {
			dao.save(estudiante);
		}
		
	}

}
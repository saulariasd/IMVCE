package ec.edu.ups.negocio;

import javax.ejb.Stateless;

import ec.edu.ups.dao.EstudianteDao;
import ec.edu.ups.entidad.Estudiante;

@Stateless
public class EstudianteON {
	private EstudianteDao dao;
	
	public void guardarEstudiante(Estudiante estudiante) throws Exception 
	{
		if(estudiante.getNombre().length()<5) {
			throw new Exception("Dimension corata");
		}
		else {
			dao.insertarEstudiante(estudiante);
		}
	}

}
package ec.edu.ups.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.entidad.Estudiante;

@Stateless
public class EstudianteDao {
	@Inject
	private EntityManager em;
	
	public void insertarEstudiante(Estudiante estudiante) {
		em.persist(estudiante);
	}
	public Estudiante readEstudiante(int id) {
		return em.find(Estudiante.class, id);
		
	}
	public void updateEstudiante(Estudiante estudiante) {
		em.merge(estudiante);
		
	}
	public void deleteEstudiante(int id) {
		Estudiante estudiante = readEstudiante(id);
		em.remove(estudiante);
	}
	public List<Estudiante> listaEstuidiante(String filtroBsuqueda){
		String jpql="Select e * from Estudiante e"
				+"where e.nombre LIKE :'filtro'";
		Query q = em.createQuery(jpql,Estudiante.class);
		q.setParameter("filtro", "%"+filtroBsuqueda+"%");
		List<Estudiante>lista=q.getResultList();
		return lista;
	}

}

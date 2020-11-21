package co.ufps.edu.dao;
import co.ufps.edu.model.Pelicula;
import co.ufps.edu.util.Conexion;

public class PeliculaDao extends Conexion <Pelicula> implements GenericDao<Pelicula> {
	
	public PeliculaDao() {
		super(Pelicula.class);
	}

}

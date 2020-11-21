package co.ufps.edu.dao;
import co.ufps.edu.model.Genero;
import co.ufps.edu.util.Conexion;

public class GeneroDao extends Conexion <Genero> implements GenericDao<Genero> {

	public GeneroDao() {
		super(Genero.class);
	}
}

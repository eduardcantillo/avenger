package co.ufps.edu.dao;
import co.ufps.edu.model.Planeta;
import co.ufps.edu.util.Conexion;

public class PlanetaDao extends Conexion <Planeta>implements GenericDao<Planeta> {
	
	public PlanetaDao() {
		super(Planeta.class);
	}

}

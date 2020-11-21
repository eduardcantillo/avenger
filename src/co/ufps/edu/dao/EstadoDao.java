package co.ufps.edu.dao;

import co.ufps.edu.model.Estado;
import co.ufps.edu.util.Conexion;

public class EstadoDao extends Conexion <Estado> implements GenericDao<Estado>  {

	public EstadoDao() {
		super(Estado.class);
	}
}

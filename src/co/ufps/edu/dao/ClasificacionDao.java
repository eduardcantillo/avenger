package co.ufps.edu.dao;

import co.ufps.edu.model.Clasificacion;
import co.ufps.edu.util.Conexion;

public class ClasificacionDao extends Conexion<Clasificacion> implements GenericDao<Clasificacion> {
	
	public ClasificacionDao() {
		super(Clasificacion.class);
	}
}

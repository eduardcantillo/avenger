package co.ufps.edu.dao;
import co.ufps.edu.model.Heroe;
import co.ufps.edu.util.Conexion;
public class HeroeDao extends Conexion <Heroe> implements GenericDao<Heroe> {
	
	public HeroeDao() {
		
		super(Heroe.class);
	}

}

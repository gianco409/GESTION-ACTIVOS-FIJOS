package pe.com.unmsm.gaf.activos.domain.repository;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import pe.com.unmsm.gaf.activos.canonical.request.ConsultaActivoRequest;
import pe.com.unmsm.gaf.activos.common.domain.repository.AbstractRepository;
import pe.com.unmsm.gaf.activos.model.Activo;

@Stateless
public class ActivoRepository extends AbstractRepository<Activo> implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ActivoRepository() {
		super(Activo.class);
	}
	
	@PersistenceContext(unitName = "pe.com.claro.vent.ventaprepagopvu")
	
	public void setPersistenceUnit00(final EntityManager em) {
		this.entityManager = em;
	}
	
	public List<Activo> consultarActivo(ConsultaActivoRequest request) throws SQLException {
		
		Activo activo = new Activo();
		List<Activo> resultList = new ArrayList<>();
		
		return resultList;
	}

	@Override
	protected Predicate[] getSearchPredicates(Root<Activo> root, Activo example) {
		// TODO Auto-generated method stub
		return null;
	}
}

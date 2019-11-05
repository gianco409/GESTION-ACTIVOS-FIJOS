package pe.com.unmsm.gaf.activos.domain.service;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import pe.com.unmsm.gaf.activos.canonical.request.ConsultaActivoRequest;
import pe.com.unmsm.gaf.activos.canonical.response.ConsultaActivoResponse;
import pe.com.unmsm.gaf.activos.domain.repository.ActivoRepository;
import pe.com.unmsm.gaf.activos.model.Activo;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ActivoService implements Serializable{
	
	@EJB
	private ActivoRepository activoRepository;
	public ConsultaActivoResponse consultarActivo(ConsultaActivoRequest request) {
		ConsultaActivoResponse response = new ConsultaActivoResponse();
		List<Activo> activoList;
		
		try {
			activoList = activoRepository.consultarActivo(request);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return response;
	}

}

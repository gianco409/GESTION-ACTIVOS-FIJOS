package pe.com.unmsm.gaf.activos.resource;

import java.text.SimpleDateFormat;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.modelmapper.ModelMapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wordnik.swagger.annotations.Api;

import pe.com.unmsm.gaf.activos.canonical.request.ConsultaActivoRequest;
import pe.com.unmsm.gaf.activos.canonical.util.DateConvertModelMapper;
import pe.com.unmsm.gaf.activos.domain.service.ActivoService;

@Stateless
@Path("gfa/activos")
@Api(value = "/activo", description = "Bienvenido!")
@Produces({"application/json;charset=UTF-8"})
public class ActivoApi {
	
	private ObjectMapper mapper = new ObjectMapper();
	private ModelMapper modelMapper = new ModelMapper();
	
	
	@EJB
	private ActivoService activoService;
	
	public ActivoApi() {
		mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        modelMapper.addConverter(new DateConvertModelMapper());
	}
	

	@GET
	@Consumes("application/json")
	public Response consultarActivo(ConsultaActivoRequest request) throws Exception {
		String result = mapper.writeValueAsString(activoService.consultarActivo(request));
		return Response.ok().entity(result).build();
	}

}

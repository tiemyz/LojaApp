package br.com.fiap.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/saldo")
public class ServicoResources {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public double getSaldo() {
		return 145.89;
	}
}

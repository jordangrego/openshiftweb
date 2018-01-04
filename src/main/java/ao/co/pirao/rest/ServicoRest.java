package ao.co.pirao.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ao.co.pirao.rest.entidades.Retorno;

@Path("/servicoRest")
public class ServicoRest {

	@GET
    @Path("/getInfo")
    @Produces({ MediaType.APPLICATION_JSON })
	public Retorno getinfo() {
		Retorno retorno = new Retorno();
		retorno.setCod(1);
		retorno.setDescricao("Informação");
		return retorno;
	}
	
	@GET
    @Path("/getTestar")
    @Produces({ MediaType.APPLICATION_JSON })
	public String getTestar() {
		return "Alow";

	}
}

package br.com.fiap.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/dados")
public class PessoaResources {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String [][] listar() {
		
		String[][] dados = new String [5][3];
		
		dados [0][0] = "Isa";
		dados [0][1] = "CPF";
		dados [0][2] = "Email";
		
		dados [1][0] = "Isa";
		dados [1][1] = "CPF";
		dados [1][2] = "Email";
		
		dados [2][0] = "Isa";
		dados [1][1] = "CPF";
		dados [1][2] = "Email";
		
		dados [3][0] = "Isa";
		dados [3][1] = "CPF";
		dados [3][2] = "Email";
		
		dados [4][0] = "Isa";
		dados [4][1] = "CPF";
		dados [4][2] = "Email";
		
		return dados;
		
	}
}

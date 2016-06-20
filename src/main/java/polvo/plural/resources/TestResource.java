package polvo.plural.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import polvo.plural.api.DataResponse;

@Path("/test")
@Produces(value=MediaType.APPLICATION_JSON)
@Consumes(value=MediaType.APPLICATION_JSON)
public class TestResource extends BaseResouce {
	
	@GET
	@Path("/")
	public Response test() {
		return Response.ok(DataResponse.build("Eu sou uma mensagem de teste!!")).build();
	}

}

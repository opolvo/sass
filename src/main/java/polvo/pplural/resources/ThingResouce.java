package polvo.pplural.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import polvo.pplural.api.DataResponse;

@Path("/api/things")
@Produces(value=MediaType.APPLICATION_JSON)
@Consumes(value=MediaType.APPLICATION_JSON)
public class ThingResouce extends BaseResouce {

	@GET
	@Path("/")
	public Response list() {
		return Response.ok(DataResponse.build("Eu sou uma mensagem de teste!!")).build();
	}

}

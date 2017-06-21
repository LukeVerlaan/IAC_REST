package NL.HU.IAC.REST_SERVICE;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/math")
public class App {

	@GET
	@Path("/Add")
	@Produces("application/json")	
	public String Add(@QueryParam("num1") int num1, @QueryParam("num2") int num2) {
		JsonObjectBuilder job = Json.createObjectBuilder();
		job.add("result", num1 + num2);
		return job.build().toString();
	}
	
	@GET
	@Path("/Extract")
	@Produces("application/json")	
	public String Extract(@QueryParam("num1") int num1, @QueryParam("num2") int num2) {
		JsonObjectBuilder job = Json.createObjectBuilder();
		job.add("result", num1 - num2);
		return job.build().toString();
	}
	
	@GET
	@Path("/Multiply")
	@Produces("application/json")	
	public String Multiply(@QueryParam("num1") int num1, @QueryParam("num2") int num2) {
		JsonObjectBuilder job = Json.createObjectBuilder();
		job.add("result", num1 * num2);
		return job.build().toString();
	}
	
	@GET
	@Path("/Divide")
	@Produces("application/json")	
	public String Divide(@QueryParam("num1") int num1, @QueryParam("num2") int num2) {
		JsonObjectBuilder job = Json.createObjectBuilder();
		job.add("result", num1 / num2);
		return job.build().toString();
	}
	
}

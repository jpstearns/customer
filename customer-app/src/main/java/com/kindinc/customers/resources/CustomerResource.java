package com.kindinc.customers.resources;
import com.kindinc.customers.representations.Customer;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.PathParam;

@Path("/customer")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {
	@GET
	@Path("/{id}")
	public Response getCustomer(@PathParam("id") int id){
		//retrieve information about the Customer with the provided ID
		return Response
				.ok(new Customer( id, "John", "Doe", "+123456789")).build();
	}
	
	@POST
	public Response createCustomer(Customer customer){
		
		//store the new Customer
		return Response
				.created(null)
				.build();
	}
	
	@DELETE
	@Path("{id}")
	public Response deleteCustomer(@PathParam("id") int id) {
		
		//delete the Customer with the provided id
		return Response
				.noContent()
				.build();
	}
	
	@PUT
	@Path("/{id}")
	public Response updateCustomer(
			@PathParam("id") int id,
			Customer customer){
		
		//update the Customer with the provided id
		return Response
				.ok(new Customer(id, customer.getFirstName(), customer.getLastName(), customer.getPhone())).build();
	}
					
}

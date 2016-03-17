package com.kindinc.customers;
import com.kindinc.customers.resources.CustomerResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class App extends Application<CustomerConfiguration> {
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	@Override
	public void initialize(Bootstrap<CustomerConfiguration> b){}
	
	@Override
	public void run(CustomerConfiguration c, Environment e) throws 
		Exception{
          e.jersey().register(new CustomerResource());
		}
    public static void main( String[] args ) throws Exception {
        new App().run(args);
    }
}

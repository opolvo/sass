package polvo.pplural;

import polvo.pplural.resources.IndexResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class PPluralApplication extends Application<PPluralConfiguration> {

	@Override
	public void run(PPluralConfiguration configuration, Environment environment) throws Exception {
		// TODO Auto-generated method stub
		
		environment.jersey().register(new IndexResource());
		
	}

}

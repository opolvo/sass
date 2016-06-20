package polvo.plural;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.setup.Environment;
import polvo.plural.api.Person;
import polvo.plural.resources.ThingResouce;

public class PPluralApplication extends Application<PPluralConfiguration> {
	
	private PPluralConfiguration configuration;

	private final HibernateBundle<PPluralConfiguration> hibernateBundle =
			new HibernateBundle<PPluralConfiguration>(Person.class) {
		public DataSourceFactory getDataSourceFactory(PPluralConfiguration configuration) {
			return configuration.getDataSourceFactory();
		}
	};
	
	public void initialize(io.dropwizard.setup.Bootstrap<PPluralConfiguration> bootstrap) {
		bootstrap.addBundle(new AssetsBundle());
		bootstrap.addBundle(hibernateBundle);
	}
	
	@Override
	public void run(PPluralConfiguration configuration, Environment environment) throws Exception {
		this.configuration = configuration;
		
		/* Resources */
		environment.jersey().register(new ThingResouce());
//		System.out.println(hibernateBundle.getSessionFactory());
//		environment.jersey().register(new PersonResource(new PersonDao(hibernateBundle.getSessionFactory())));

	}
	
	public static void main(String[] args) throws Exception {
		new PPluralApplication().run(args);
	}
	
	public PPluralConfiguration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(PPluralConfiguration configuration) {
		this.configuration = configuration;
	}

}

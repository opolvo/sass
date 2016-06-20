package polvo.plural;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

public class PPluralConfiguration extends Configuration {

	@Valid
	@NotNull
	private DataSourceFactory database = new DataSourceFactory();
	
	@JsonProperty("database")
	public DataSourceFactory getDataSourceFactory() {
		return database;
	}
	
	@JsonProperty("database")
	public void setDataSourceFactory(DataSourceFactory database) {
		this.database = database;
	}
	
}

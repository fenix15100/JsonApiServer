package app;

import com.yahoo.elide.contrib.dropwizard.elide.ElideBundle;
import com.yahoo.elide.resources.JsonApiEndpoint;

import app.domain.Course;
import app.domain.School;
import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class JsonApiServer extends Application<Settings>{

	
	 private final ElideBundle<Settings> repository = new ElideBundle<Settings>(School.class,Course.class){
	        @Override
	        public DataSourceFactory getDataSourceFactory(Settings configuration) {
	            return configuration.getDatabase();
	        }
	    };



	@Override
	public void initialize(Bootstrap<Settings> bootstrap) {
		bootstrap.addBundle(repository);
	}

	
	
	public void run(Settings settings, Environment environment) throws Exception {
		environment.jersey().register(JsonApiEndpoint.class);
	
		
	}
	
	public static void main(String[] args) throws Exception {
		
		new JsonApiServer().run("server","app.yml");
		
	
		
	
}
	
	

	

}

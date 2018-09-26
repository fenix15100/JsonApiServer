package app;

import com.yahoo.elide.standalone.ElideStandalone;

public class JsonApiServer {

	public static void main(String[] args) throws Exception {
		ElideStandalone app = new ElideStandalone(new Settings());
        app.start();

	}

}

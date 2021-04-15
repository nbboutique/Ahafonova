import org.obrii.fit.mit.ahafonova_new_spring.AhafonovaNewSpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;





public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AhafonovaNewSpringApplication.class);
	}

}

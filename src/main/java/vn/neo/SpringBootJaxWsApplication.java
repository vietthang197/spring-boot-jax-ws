package vn.neo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = "jaxwsconfig.xml")
public class SpringBootJaxWsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJaxWsApplication.class, args);
    }

}

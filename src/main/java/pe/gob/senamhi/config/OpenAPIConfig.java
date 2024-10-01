package pe.gob.senamhi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Value("${portalweb.openapi.dev-url}")
    private String devUrl;

    @Bean
    public OpenAPI myOpenAPI(){
        //Definir el servidor de desarrollo
        Server devServer = new Server();
        devServer.setUrl(devUrl);
        devServer.setDescription("Server URL in Portal Web");

        //Informacion de contacto
        Contact contact = new Contact();
//        contact.setEmail("senamhi@gmail.com");
//        contact.setName("senamhi");
        contact.setUrl("https://www.senamhi.gob.pe");

        //Informacion general de la API
        Info info = new Info()
                .title("Portal Web API")
                .version("1.0.0")
                .contact(contact)
                .description("This API exposes endpoints of Web Services");
//                .termsOfService("https://www.senamhi.gob.pe");

        return new OpenAPI()
                .info(info);
    }

}

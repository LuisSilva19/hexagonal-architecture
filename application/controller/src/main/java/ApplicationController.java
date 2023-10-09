import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.servers.ServerVariable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.core", "com.infrastructure, com.application"})
@EnableJpaRepositories(basePackages = "com.infrastructure.repository")
@EntityScan(basePackages = "com.infrastructure.entity")
@OpenAPIDefinition(
    info = @Info(
        title = "Título da API",
        description = "Descrição da API",
        version = "1.000"
    ),
    servers = @Server(
        url = "${custom.server.url}/api",
        description = "Descrição do Server",
        variables = {
            @ServerVariable(name = "serverUrl", defaultValue = "localhost"),
            @ServerVariable(name = "serverHttpPort", defaultValue = "8080")
        }
))
public class ApplicationController {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationController.class, args);
    }

}

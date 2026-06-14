package ua.opnu.labwork2.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customopenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("REST API система управління подіями")
                        .version("1.0.0")
                        .description("REST API для автоматизації обліку подій. " +
                                "Забезпечує повний CRUD для сутностей, валідацію вхідних даних " +
                                "та централізовану обробку виключень.")
                        .contact(new Contact()
                                .name("ІШІР кафедра аналізу даних ОНПУ")
                                .email("uwut@op.edu.ua")
                                .url("https://op.edu.ua"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://springdoc.org")));
    }
}

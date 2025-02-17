package es.uvigo.mei.drugs_to_avoid;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configura CORS
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    /*
     * CORS es una política de seguridad implementada en los navegadores web que
     * permite el acceso controlado a recursos de diferentes dominios,
     * y debes activarlo en tu entorno local si deseas hacer solicitudes HTTP desde un dominio diferente al del servidor
     * para evitar restricciones de seguridad del navegador.
     */
    @Override
    public void addCorsMappings(final CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(
                        "http://localhost:3000") // Reemplaza con el origen permitido para tu aplicación cliente
                .allowedMethods("*") // Especifica los métodos HTTP permitidos
                .allowedHeaders("*") // Especifica los encabezados permitidos
                .allowCredentials(true); // Permite enviar cookies de autenticación si es necesario
    }
}
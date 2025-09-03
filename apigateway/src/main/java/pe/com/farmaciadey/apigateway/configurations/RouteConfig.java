package pe.com.farmaciadey.apigateway.configurations;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("auth-service", r -> r.path("/auth/**")
                        .uri("http://localhost:7001/"))
                .route("usuario-service", r -> r.path("/usuario/**")
                        .uri("http://localhost:7002/"))
                .route("producto-service", r -> r.path("/producto/**")
                        .uri("http://localhost:7003/"))
                .route("metodopago-service", r -> r.path("/metodopago/**")
                        .uri("http://localhost:7004/"))
                .route("compra-service", r -> r.path("/compra/**")
                        .uri("http://localhost:7005/"))
                .build();
    }
}

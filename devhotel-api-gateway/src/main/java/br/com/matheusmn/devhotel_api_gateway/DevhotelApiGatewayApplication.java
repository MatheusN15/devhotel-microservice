package br.com.matheusmn.devhotel_api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class DevhotelApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevhotelApiGatewayApplication.class, args);
	}

//	@Bean
//	RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
//		Function<PredicateSpec, Buildable<Route>> function = p -> p
//				.path("/get")
//				.filters(f -> f
//						.addRequestHeader("Hello", "World")
//						.addRequestParameter("Hello", "World"))
//				.uri("http://httpbin.org:80");
//
//		return builder.routes()
//				.route(function)
//				.route(p -> p.path("/users/**").uri("lb://user-service"))
//				.route(p -> p.path("/room-service/**").uri("lb://room-service"))
//				.build();
//	}
}

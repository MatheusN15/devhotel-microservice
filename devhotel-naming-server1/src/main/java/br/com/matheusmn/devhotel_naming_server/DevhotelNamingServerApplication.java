package br.com.matheusmn.devhotel_naming_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DevhotelNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevhotelNamingServerApplication.class, args);
	}

}

package com.jos.dem.rest.client

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ConfigurableApplicationContext

import com.jos.dem.rest.client.service.RestClient

@SpringBootApplication
class RestClientApplication {

	static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run RestClientApplication, args
    context.getBean(RestClient.class).getBeverage()
	}

}

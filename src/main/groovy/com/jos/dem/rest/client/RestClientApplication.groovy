package com.jos.dem.rest.client

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ConfigurableApplicationContext

import com.jos.dem.rest.client.model.Beverage
import com.jos.dem.rest.client.service.RestClient

@SpringBootApplication
class RestClientApplication {

	static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run RestClientApplication, args
    Beverage beverage = context.getBean(RestClient.class).getBeverage()
    println "beverage: ${beverage.dump()}"
	}

}

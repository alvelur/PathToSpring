package com.spring.demo.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages={"com.spring.demo.market.persistence.mapper.ProductMapper"})
public class DemoMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMarketApplication.class, args);
	}

}

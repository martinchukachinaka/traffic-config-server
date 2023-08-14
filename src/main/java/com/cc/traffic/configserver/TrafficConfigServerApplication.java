package com.cc.traffic.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class TrafficConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrafficConfigServerApplication.class, args);
	}
}

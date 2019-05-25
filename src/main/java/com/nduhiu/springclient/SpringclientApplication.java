package com.nduhiu.springclient;

import com.nduhiu.springclient.client.GetTodos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringclientApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringclientApplication.class, args);

		GetTodos newGetTodos = new GetTodos();
	}

}

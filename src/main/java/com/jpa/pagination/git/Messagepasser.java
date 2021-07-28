package com.jpa.pagination.git;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class Messagepasser implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		int i=10;
		System.out.println("Hello GIT"+i);

	}

}

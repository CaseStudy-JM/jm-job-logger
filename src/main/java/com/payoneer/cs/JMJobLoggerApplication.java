package com.payoneer.cs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.payoneer.cs.client.Job;

@SpringBootApplication
public class JMJobLoggerApplication implements CommandLineRunner {
	@Autowired
	private Job job;

	public static void main(String[] args) {
		SpringApplication.run(JMJobLoggerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		job.execute(args[0], args);
	}
}

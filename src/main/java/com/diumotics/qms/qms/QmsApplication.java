package com.diumotics.qms.qms;

import com.diumotics.qms.qms.controller.QueueController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.diumotics.qms.qms")
public class QmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(QmsApplication.class, args);
	}

}

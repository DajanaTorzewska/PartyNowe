package com.sda.PartyGenerator;

import com.sda.PartyGenerator.service.MyConfig;
import com.sda.PartyGenerator.service.PartyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PartyGeneratorApplication {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(PartyGeneratorApplication.class, args);

		PartyService partyService = ac.getBean(PartyService.class);

		partyService.printMessage();

		MyConfig myConfig= ac.getBean(MyConfig.class);
		System.out.println(myConfig.getMyFieldA());
		System.out.println(myConfig.getMyFieldB());
	}

}

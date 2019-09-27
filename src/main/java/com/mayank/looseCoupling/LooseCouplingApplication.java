package com.mayank.looseCoupling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class LooseCouplingApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(LooseCouplingApplication.class);
	public static void main(String[] args) {
		//ApplicationContext applicationContext = SpringApplication.run(LooseCouplingApplication.class, args);
		//BinarySearch bimpl = applicationContext.getBean(BinarySearch.class);
		//System.out.println("3");
		//int result = bimpl.binarySearch(new int[] {1,2,3},3);
		//System.out.println(result);
//		ApplicationContext applicationContext = SpringApplication.run(LooseCouplingApplication.class, args);
//		PersonDAO personDao = 
//				applicationContext.getBean(PersonDAO.class);
//		
//		PersonDAO personDao2 = 
//				applicationContext.getBean(PersonDAO.class);
//		
//		LOGGER.info("{}", personDao);
//		LOGGER.info("{}", personDao.getJdbcConnection());
//		
//		LOGGER.info("{}", personDao2);
//		LOGGER.info("{}", personDao2.getJdbcConnection());
		ApplicationContext applicationContext = SpringApplication.run(LooseCouplingApplication.class);
		Service service = applicationContext.getBean(Service.class);
		String ret = service.message();
		System.out.println("URL: "+ret);
		LOGGER.info("{}", service);
		
	}

}

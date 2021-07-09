package com.cognizant.springlearn;
import java.text.SimpleDateFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Date;
import java.util.List;
@SpringBootApplication
public class SpringLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	public void displayDate() {
		LOGGER.info("Start displayDate()");
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat",SimpleDateFormat.class);
		try {
			Date date = format.parse("31/12/2018");
			LOGGER.debug(date.toString());
		}
		catch(Exception e) {
			System.out.println(e);
			LOGGER.info("Exception caught");
		}
		LOGGER.info("End displayDate()");
	
	}
	
	public void displayCountry() {
		LOGGER.info("Start displayCountry()");
		ApplicationContext context = new ClassPathXmlApplicationContext("countries.xml");
		Country country1 = context.getBean("country",Country.class);
		Country country2 = context.getBean("country",Country.class);
		LOGGER.debug("Country:"+country1.toString()+"AnotherCountry:"+country2.toString());
		LOGGER.info("End displayCountry()");
	}
	
	public void displayCountries() {
		LOGGER.info("Start displayCountries()");
		ApplicationContext context = new ClassPathXmlApplicationContext("countries.xml");
		List<Country> list = (List<Country>) context.getBean("countryList");
		LOGGER.debug("CountryList:"+list.toString());
		LOGGER.info("End displayCountries");
	}
	public static void main(String[] args) {
		
		SpringApplication.run(SpringLearnApplication.class, args);

	}
}
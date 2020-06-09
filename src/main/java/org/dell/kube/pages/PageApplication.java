package org.dell.kube.pages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PageApplication {

	public static void main(String[] args) {
		SpringApplication.run(PageApplication.class, args);
	}

	/*@Bean
	public PagesRepository pagesRepository(DataSource dataSource){
		return new Pages
	}*/

}

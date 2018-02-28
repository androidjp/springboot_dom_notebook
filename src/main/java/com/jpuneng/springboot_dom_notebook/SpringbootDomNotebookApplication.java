package com.jpuneng.springboot_dom_notebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

//For WebApp
@SpringBootApplication
public class SpringbootDomNotebookApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringbootDomNotebookApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDomNotebookApplication.class, args);
	}
}

//For Java
//@SpringBootApplication
//public class SpringbootDomNotebookApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringbootDomNotebookApplication.class, args);
//	}
//}

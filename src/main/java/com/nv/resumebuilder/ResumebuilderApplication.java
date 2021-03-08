/**
 * @SpringBootApplication:- 
 * @EnableAutoConfiguration: enable Spring Boot’s auto-configuration 
 * mechanism 
 * @ComponentScan: enable @Componentscan on the package where the application is
 *  located (see the best practices)
 *  It is used when we want to scan a package for beans.
 *   It is used with the annotation @Configuration.
 *    We can also specify the base packages to scan for Spring Components.
	@Configuration: allow to register extra beans in the context or import additional
	 configuration classes
 * 
 */

package com.nv.resumebuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ResumebuilderApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(ResumebuilderApplication.class, args);
	}
}

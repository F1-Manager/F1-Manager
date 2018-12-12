package com.edu.eci.arsw.f1manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class F1managerApplication {

        /**
         * Inicia el spring boot application
         * @param args 
         */
	public static void main(String[] args) {
		SpringApplication.run(F1managerApplication.class, args);
	}

        /**
         * Retorna una instancia de BCryptPasswordEncoder
         * @return 
         */
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}
}

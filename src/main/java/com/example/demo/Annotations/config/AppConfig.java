package com.example.demo.Annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.Annotations.Service.Pizza;
import com.example.demo.Annotations.Service.VegPizzaService;
import com.example.demo.Annotations.controller.PizzaController;

@Configuration
public class AppConfig {
	
	//@Bean
	@Bean(name="VegPizzaBean")
	public Pizza vegPizza()
	{
		return new VegPizzaService();
	}

	//here without @autowired annotaion we can inject the depencency
//	@Bean
//	public PizzaController pizzaController()
//	{
//		return new PizzaController(vegPizza());
//	}
}

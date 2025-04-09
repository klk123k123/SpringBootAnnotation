package com.example.demo.Annotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Annotations.Service.VegPizzaService;
import com.example.demo.Annotations.controller.PizzaController;

@SpringBootApplication
public class SpringBootAnnotationApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootAnnotationApplication.class, args);
		var context=SpringApplication.run(SpringBootAnnotationApplication.class, args);
		PizzaController pizza=context.getBean(PizzaController.class);
		//System.out.println(pizza.getPizza());
		//second way with name 
		//PizzaController pizza1=(PizzaController) context.getBean("PizzaController");
		//System.out.println("Thank You "+ pizza1.getPizza());
		//System.out.println("Thank You Constructor "+ pizza1.getConstructPizza());
		//System.out.println("Thank You settergetter "+ pizza1.getSetPizza());
		System.out.println("Thank You  "+pizza.getQualifierPizza());
		
		//VegPizzaService veg=context.getBean(VegPizzaService.class);
		VegPizzaService veg=(VegPizzaService) context.getBean("VegPizzaBean");
		System.out.println("BeanProject : "+veg.getPizza());
		
	}

}

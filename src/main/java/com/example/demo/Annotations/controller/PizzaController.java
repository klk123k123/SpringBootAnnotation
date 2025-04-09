package com.example.demo.Annotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.Annotations.Service.Pizza;
//import com.example.demo.Annotations.Service.VegPizzaService;

//@Component  // without name we use this class object in main class
@Component("PizzaController")//withname
public class PizzaController {
	
	//private VegPizzaService pizzaService;
	//setter inject

	
	/*
	 * public PizzaService getPizzaService() { return pizzaService; }
	 * 
	 * public void setPizzaService(PizzaService pizzaService) { this.pizzaService =
	 * pizzaService; }
	 * 
	 * public String getPizza() { return "Hot Pizza!!!!!!!!!!!"; } public String
	 * getSetPizza() { return VegPizzaService.getPizza(); }
	 */
	
	//constructor inject
	
	/*
	 * public PizzaController(VegPizzaService pizza) { this.pizzaService=pizza; }
	 * 
	 * public String getConstructPizza() { return pizzaService.getPizza(); }
	 */

 private final Pizza pizza;

/*
 * public PizzaController(@Qualifier("VegPizzaService") Pizza pizzas) {
 * this.pizza=pizzas; }
 */
@Autowired
public PizzaController (Pizza pizzas) {
	 this.pizza=pizzas;}
public String getQualifierPizza()
{
	return pizza.getPizza();
}

}

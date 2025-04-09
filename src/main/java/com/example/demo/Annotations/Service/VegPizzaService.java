package com.example.demo.Annotations.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
//@Qualifier("VegPizzaService")
//@Primary //need to give this priority
public class VegPizzaService implements Pizza
{
	@Override
	public String getPizza()
	{
		return "Veg Pizza";
	}



}

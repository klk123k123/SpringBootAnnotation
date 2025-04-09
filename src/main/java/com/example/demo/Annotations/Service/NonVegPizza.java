package com.example.demo.Annotations.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("NonVegPizza")
@Primary
public class NonVegPizza implements Pizza{

	@Override
	public String getPizza() {
		// TODO Auto-generated method stub
		return "Non-Veg Pizza";
	}

}

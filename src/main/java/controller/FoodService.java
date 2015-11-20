package controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import model.Food;

@ManagedBean(name="foodService")
@ApplicationScoped
public class FoodService {
	
	public List<Food> returnFood() {
		List<Food> foods = new ArrayList<Food>();
		foods.add(new Food("Alnatura"));
		foods.add(new Food("Bergbauer"));
		return foods;
	}
	
	public void addFood(Food food) {
		System.out.println(food.getMaker());
	}

}

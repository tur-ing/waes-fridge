package view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import model.Food;
import controller.FoodService;

@ManagedBean(name="addFoodView")
@ViewScoped
public class AddFoodView implements Serializable {

	private static final long serialVersionUID = -4697538088438561706L;

	String maker;
	
	@ManagedProperty("#{foodService}")
	FoodService foodService;
	
	public void addFood() {
		Food food = new Food(maker);
		foodService.addFood(food);
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public FoodService getFoodService() {
		return foodService;
	}

	public void setFoodService(FoodService foodService) {
		this.foodService = foodService;
	}
	
}

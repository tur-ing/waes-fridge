package view;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.annotation.*;

import controller.FoodService;
import model.Food;

@ManagedBean(name="inventoryView")
@ViewScoped
public class InventoryView implements Serializable {

	private static final long serialVersionUID = -454451644964893590L;
	private List<Food> foods;
	
	@ManagedProperty("#{foodService}")
	FoodService foodService;
	
	@PostConstruct
	public void init() {
		foods = foodService.returnFood();
	}
		
	public List<Food> getFoods() {
		return foods;
	}
	
	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}

	public FoodService getFoodService() {
		return foodService;
	}

	public void setFoodService(FoodService foodService) {
		this.foodService = foodService;
	}
	
}

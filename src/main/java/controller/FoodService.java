package controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.hibernate.SessionFactory;

import model.Food;

@ManagedBean(name="foodService")
@ApplicationScoped
public class FoodService {
	
	SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
	
	public List<Food> returnFood() {
		List<Food> foods = new ArrayList<Food>();
		foods.add(new Food("Alnatura"));
		foods.add(new Food("Bergbauer"));
		return foods;
	}
	
	public void addFood(Food food) {
		Session session = this.sessionFactory.openSession();
		System.out.println(food.getMaker());
	}
	
    public void save(Traveler t) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        //t.getAddress().add(a);
        session.save(t);
        tx.commit();
        session.close();
    }

}

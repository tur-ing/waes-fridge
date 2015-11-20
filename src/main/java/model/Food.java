package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Food {
	
	@Id
	Long id;
	String maker;
	String name;
	int expiryDate;

	public Food(String maker) {
		this.maker = maker;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(int expiryDate) {
		this.expiryDate = expiryDate;
	}

}

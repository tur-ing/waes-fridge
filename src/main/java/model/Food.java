package model;

public class Food {

	String maker;
	int expiry_date;
	String case_type;
	
	public Food(String maker) {
		this.maker = maker;
	}
	
	public String getMaker() {
		return maker;
	}
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public int getExpiry_date() {
		return expiry_date;
	}
	
	public void setExpiry_date(int expiry_date) {
		this.expiry_date = expiry_date;
	}
	
	public String getCase_type() {
		return case_type;
	}
	
	public void setCase_type(String case_type) {
		this.case_type = case_type;
	}
	
}

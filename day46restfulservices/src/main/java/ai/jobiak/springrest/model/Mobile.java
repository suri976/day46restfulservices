package ai.jobiak.springrest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	@GeneratedValue
	private long mobileId;
	private String brand;
	private String model;
	private double price;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Mobile(long mobileId, String brand, String model, double price) {
		super();
		this.mobileId = mobileId;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	public long getMobileId() {
		return mobileId;
	}

	public void setMobileId(long mobileId) {
		this.mobileId = mobileId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

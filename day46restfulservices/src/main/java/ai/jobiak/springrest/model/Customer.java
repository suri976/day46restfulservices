package ai.jobiak.springrest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private long cusId;
	private String name;
	private String address;
	
	public Customer() {
		
		// TODO Auto-generated constructor stub
	}

	public Customer(long cusId, String name, String address) {
		super();
		this.cusId = cusId;
		this.name = name;
		this.address = address;
	}

	public long getCusId() {
		return cusId;
	}

	public void setCusId(long cusId) {
		this.cusId = cusId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}

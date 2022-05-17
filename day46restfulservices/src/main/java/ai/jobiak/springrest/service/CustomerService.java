package ai.jobiak.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ai.jobiak.springrest.model.Customer;
import ai.jobiak.springrest.model.Mobile;
import ai.jobiak.springrest.repo.CustomerRepo;
import ai.jobiak.springrest.repo.MobileRepo;

@Service
public class CustomerService {
	@Autowired
	CustomerRepo repo;
	
	public Customer addCustomer(Customer cus) {
		Customer ref = repo.save(cus);
		return ref;
	}
	public Customer modifyCustomer(Customer cus) {
		//Mobile ref = repo.save(mobile);
		return repo.save(cus);
	}
	public void removeCustomer(Long cusid)
	{
		repo.deleteById(cusid);
	}
	public List<Customer>getAll()
	{
		return repo.findAll();
	}
}

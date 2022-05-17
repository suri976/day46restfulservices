package ai.jobiak.springrest.resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ai.jobiak.springrest.model.Customer;
import ai.jobiak.springrest.model.Mobile;
import ai.jobiak.springrest.service.CustomerService;
import ai.jobiak.springrest.service.MobileService;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/customer")
public class Hotel 
{
	@Autowired
	CustomerService serv;
	
	@PostMapping(value ="/create",consumes = MediaType.APPLICATION_JSON_VALUE,produces= MediaType.APPLICATION_JSON_VALUE)
	public Customer newCustomer(@RequestBody Customer cus) {
		Customer ref = serv.addCustomer(cus);
		return ref;
	}
	@PutMapping(value ="/modify",consumes = MediaType.APPLICATION_JSON_VALUE,produces= MediaType.APPLICATION_JSON_VALUE)
	public Customer modifyCustomer(@RequestBody Customer cus) {
		Customer ref = serv.modifyCustomer(cus);
		return ref;
	}
	
	@DeleteMapping(value ="/remove/{cusId}")
	//@PathParam(value="mobileid") Long mobileid
	
	public void removeCustomer(@PathVariable Long cusId) {
//		Mobile ref = serv.modifyMobile(mobile);
//		return ref;
		serv.removeCustomer(cusId);
	}
	
	@GetMapping(value="/display",produces= MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> showAll()
	{
		return serv.getAll();
		//return new Mobile(1001,"Samsung"," E@FH,Dual Camera,32 GB Memory,49999,I got you",48500);
	}
	
}

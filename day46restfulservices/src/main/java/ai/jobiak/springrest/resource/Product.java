package ai.jobiak.springrest.resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ai.jobiak.springrest.model.Mobile;
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
@RequestMapping("/catalog")
public class Product 
{
	@Autowired
	MobileService serv;
	@GetMapping(value="/mobile",produces= MediaType.APPLICATION_JSON_VALUE)
	public Mobile showCatalog()
	{
		return new Mobile(1001,"Samsung"," E@FH,Dual Camera,32 GB Memory,49999,I got you",48500);
	}
	@GetMapping("/intro")
	public String introduction()
	{
		return new String("I am surendra");
	}
	
	@GetMapping("/search/{modelId}")
	public String searchModel(@PathVariable(value="modelId")String modelId)
	{
		return new String(modelId+"Is availabel in Blue and Black color");
	}
	@GetMapping("/search/{modelId}/brand/{brand}")
	public String searchitem(@PathVariable(value="modelId")String modelId,@PathVariable(value="brand")String brand)
	{
		return new String(brand+modelId+"Is not avliable in current location");
	}
	@PostMapping(value ="/create",consumes = MediaType.APPLICATION_JSON_VALUE,produces= MediaType.APPLICATION_JSON_VALUE)
	public Mobile newProduct(@RequestBody Mobile mobile) {
		Mobile ref = serv.addMobile(mobile);
		return ref;
	}
	@PutMapping(value ="/modify",consumes = MediaType.APPLICATION_JSON_VALUE,produces= MediaType.APPLICATION_JSON_VALUE)
	public Mobile modifyProduct(@RequestBody Mobile mobile) {
		Mobile ref = serv.modifyMobile(mobile);
		return ref;
	}
	
	@DeleteMapping(value ="/remove/{mobileId}")
	//@PathParam(value="mobileid") Long mobileid
	
	public void removeProduct(@PathVariable Long mobileId) {
//		Mobile ref = serv.modifyMobile(mobile);
//		return ref;
		serv.removeProduct(mobileId);
	}
	
	@GetMapping(value="/display",produces= MediaType.APPLICATION_JSON_VALUE)
	public List<Mobile> showAll()
	{
		return serv.getAll();
		//return new Mobile(1001,"Samsung"," E@FH,Dual Camera,32 GB Memory,49999,I got you",48500);
	}
	
}

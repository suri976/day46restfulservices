package ai.jobiak.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ai.jobiak.springrest.model.Mobile;
import ai.jobiak.springrest.repo.MobileRepo;

@Service
public class MobileService {
	@Autowired
	MobileRepo repo;
	
	public Mobile addMobile(Mobile mobile) {
		Mobile ref = repo.save(mobile);
		return ref;
	}
	public Mobile modifyMobile(Mobile mobile) {
		//Mobile ref = repo.save(mobile);
		return repo.save(mobile);
	}
	public void removeProduct(Long mobileid)
	{
		repo.deleteById(mobileid);
	}
	public List<Mobile>getAll()
	{
		return repo.findAll();
	}
}

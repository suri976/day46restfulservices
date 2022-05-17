package ai.jobiak.springrest.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import ai.jobiak.springrest.model.Customer;


	public interface CustomerRepo extends JpaRepository<Customer, Long>{

	}





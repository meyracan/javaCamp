package javaCampDay4Homework2.Concrete;

import javaCampDay4Homework2.abstracts.CustomerCheckService;
import javaCampDay4Homework2.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {


	public boolean checkIfRealPerson(Customer customer) {
	
		return true;
	}


	

}

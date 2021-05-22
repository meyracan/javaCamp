package javaCampDay4Homework2.abstracts;

import javaCampDay4Homework2.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to database: " + customer.getFirstName() + " " + customer.getLastName());
		
	}

}

package javaCampDay4Homework3.adapters;

import javaCampDay4Homework3.abstracts.UserCheckManagementService;
import javaCampDay4Homework3.entities.User;

public class MernisServiceAdapter implements UserCheckManagementService {

	@Override
	public boolean checkIfRealPerson(User user) {
		
		return true;//simulation
	}

}

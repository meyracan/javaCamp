package javaCampDay4Homework3.concretes;

import javaCampDay4Homework3.abstracts.UserCheckManagementService;
import javaCampDay4Homework3.entities.User;

public class UserCheckManager implements UserCheckManagementService {

	@Override
	public boolean checkIfRealPerson(User user) {
		return true;
	}

}

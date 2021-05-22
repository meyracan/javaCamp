package javaCampDay4Homework3.concretes;

import javaCampDay4Homework3.abstracts.UserCheckManagementService;
import javaCampDay4Homework3.abstracts.UserManagementService;
import javaCampDay4Homework3.entities.User;

public class UserManager implements UserManagementService {

	
	
	UserCheckManagementService userCheckManagementService;
	public UserManager(UserCheckManagementService userCheckManagementService) {
		this.userCheckManagementService = userCheckManagementService;
	}

	@Override
	public void addNewUser(User user) {
		if(this.userCheckManagementService.checkIfRealPerson(user)) {
			System.out.println("User is added: " + user.getFirstName());
		}
		else {
			System.out.println("User is not added: " + user.getFirstName());
		}
		
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("User deleted: " + user.getFirstName());
		
	}

	@Override
	public void updateUser(User user) {
		System.out.println("User updated: " + user.getFirstName());
		
	}

}

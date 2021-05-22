package javaCampDay4Homework3.abstracts;

import javaCampDay4Homework3.entities.User;

public interface UserManagementService {
	
	void addNewUser(User user);
	void deleteUser(User user);
	void updateUser(User user);

}

package javaCampDay5Homework.business.abstracts;

import javaCampDay5Homework.entities.concretes.User;

public interface UserService {
	
	void register(User user);
	void signIn(String email, String password);
	void signInWithExternalSystem();
	

}

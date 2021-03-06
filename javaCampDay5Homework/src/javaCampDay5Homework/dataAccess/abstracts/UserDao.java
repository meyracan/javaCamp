package javaCampDay5Homework.dataAccess.abstracts;

import java.util.List;

import javaCampDay5Homework.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void delete(User user);
	void update(User user);
	List<User> getAll();

}

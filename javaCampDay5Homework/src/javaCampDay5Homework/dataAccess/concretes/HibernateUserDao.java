package javaCampDay5Homework.dataAccess.concretes;

import java.util.List;

import javaCampDay5Homework.dataAccess.abstracts.UserDao;
import javaCampDay5Homework.entities.concretes.User;
import javaCampDay5Homework.entities.concretes.UserList;

public class HibernateUserDao implements UserDao {
	
	private UserList userList;

	public HibernateUserDao(UserList userList) {
		this.userList = userList;
	}

	@Override
	public void add(User user) {
		System.out.println("User added.");
		userList.userList.add(user);
		
	}

	@Override
	public void delete(User user) {
		System.out.println("User deleted.");
		userList.userList.remove(user);
		
	}

	@Override
	public void update(User user) {
		System.out.println("User updated.");
		
	}

	@Override
	public List<User> getAll() {
		return userList.userList;
	}
	
	

}

package javaCampDay5Homework;

import javaCampDay5Homework.business.abstracts.UserService;
import javaCampDay5Homework.business.concretes.UserManager;
import javaCampDay5Homework.core.adapters.GoogleValidationManagerAdapter;
import javaCampDay5Homework.core.mailCheck.MailCheckManager;
import javaCampDay5Homework.dataAccess.concretes.HibernateUserDao;
import javaCampDay5Homework.entities.concretes.User;
import javaCampDay5Homework.entities.concretes.UserList;

public class Main {

	public static void main(String[] args) {

		UserList userList = new UserList();
		UserService userService = new UserManager(new HibernateUserDao(userList), new MailCheckManager(), new GoogleValidationManagerAdapter());
		userService.register(new User("Meyra","Can", "abc@gmail.com", "123456"));
		userService.signIn("abc@gmail.com","123456");
		
	}

}

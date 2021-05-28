package javaCampDay5Homework.core.mailCheck;

import javaCampDay5Homework.entities.concretes.User;

public interface MailCheckService {
	
	boolean regexMailCheck(User user);
	public boolean sendVerificationEmail(User user);

}

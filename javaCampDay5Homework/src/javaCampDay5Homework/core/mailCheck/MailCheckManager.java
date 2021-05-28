package javaCampDay5Homework.core.mailCheck;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javaCampDay5Homework.entities.concretes.User;

public class MailCheckManager implements MailCheckService{

	@Override
	public boolean regexMailCheck(User user) {
		Pattern pattern = Pattern.compile(
				"^[\\w!#$%&'+/=?`{|}~^-]+(?:\\.[\\w!#$%&'+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$"
				);
        Matcher matcher = pattern.matcher(user.getEmail());

        return matcher.matches();
	}

	@Override
	public boolean sendVerificationEmail(User user) {
		System.out.println("Validation e-mail has been sent.");
		return true; //simulation
		
	}

	
	
}

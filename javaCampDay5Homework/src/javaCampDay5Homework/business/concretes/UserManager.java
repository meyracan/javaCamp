package javaCampDay5Homework.business.concretes;


import javaCampDay5Homework.business.abstracts.UserService;
import javaCampDay5Homework.core.adapters.ExternalValidationService;
import javaCampDay5Homework.core.mailCheck.MailCheckService;
import javaCampDay5Homework.dataAccess.abstracts.UserDao;
import javaCampDay5Homework.entities.concretes.User;

public class UserManager implements UserService {

	private MailCheckService mailCheckService;
	private ExternalValidationService externalValidationService;
	private UserDao userDao;
	
	public UserManager(UserDao userDao, MailCheckService mailCheckService, ExternalValidationService externalValidationService) {
		this.userDao = userDao;
		this.mailCheckService = mailCheckService;
		this.externalValidationService = externalValidationService;
	}

	
	@Override
	public void register(User user) {
		 
		if(user.getPassword().length()<6) {
			System.out.println("Password can not be less than 6 digits!");
			return;
		}
		
		if(user.getFirstName().length()<2 || user.getLastName().length()<2) {
			System.out.println("Firstname and lastname must contain at least 2 characters!");
			return;
		}
		
		if(!mailCheckService.regexMailCheck(user)) {
			System.out.println("Invalid email address!");
			return;
		}
		
		if(!mailCheckService.sendVerificationEmail(user)) {
			System.out.println("E-mail could not verified!");
			return;
		}
		
		for (User customer: userDao.getAll()) {
			if(customer.getEmail()== user.getEmail()){
				System.out.println("This e-mail address has been used before!");
				return;
			}
		}
		
		this.userDao.add(user);
		System.out.println("The e-mail address is verified and the user is registered.");
		
	}

	@Override
	public void signIn(String email, String password) {
		for (User customer: userDao.getAll()) {
			if(customer.getEmail()== email && customer.getPassword() == password){
				System.out.println("Sign in is successful:" + customer.getFirstName()+" "+ customer.getLastName());
				return;
			}
		}
		System.out.println("Sign in is unsuccessful.");
	}


	@Override
	public void signInWithExternalSystem() {
		externalValidationService.signInWithExternal();
		
	}

}

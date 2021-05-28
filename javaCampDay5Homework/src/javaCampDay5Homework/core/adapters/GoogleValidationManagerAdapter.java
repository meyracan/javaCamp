package javaCampDay5Homework.core.adapters;

import javaCampDay5Homework.googleValidationSystem.GoogleValidationManager;

public class GoogleValidationManagerAdapter implements ExternalValidationService{

	@Override
	public void signInWithExternal() {
		GoogleValidationManager googleValidationManager  = new GoogleValidationManager();
		googleValidationManager.signInWithGoogle();
	}
	
	

}

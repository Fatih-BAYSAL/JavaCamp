package eCommerceDemo.core.concretes;

import eCommerceDemo.core.abstracts.GoogleService;
import eCommerceDemo.entities.concretes.User;
import eCommerceDemo.googleAccount.GoogleManager;

public class GoogleManagerAdapter implements GoogleService {
	
	private GoogleManager  googleManager;
	

	public GoogleManagerAdapter(GoogleManager googleManager) {
		this.googleManager = googleManager;
	}

	@Override
	public void register(User user) {
		googleManager.register(user);
		
	}

	@Override
	public void login(User user) {
		googleManager.login(user);
		
	}

}

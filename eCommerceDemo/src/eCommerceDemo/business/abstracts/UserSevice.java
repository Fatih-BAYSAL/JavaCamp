package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface UserSevice {
	
	void register(User user);
	void login(User user);
	void confirm(User user);
	void registerWithEmail(User user);
	void loginWithEmail(User user);

}

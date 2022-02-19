package eCommerceDemo.googleAccount;

import eCommerceDemo.entities.concretes.User;

public class GoogleManager {
	
	public void register(User user) {
		System.out.println(user.getFirstName()+" "+ user.getLastName() + " Basarili bir sekilde kaydoldunuz!");
	}
	
	public void login(User user) {
		System.out.println(user.getFirstName()+" "+ user.getLastName() + " Basarili bir sekilde siteye giris yaptiniz!");
	}

}

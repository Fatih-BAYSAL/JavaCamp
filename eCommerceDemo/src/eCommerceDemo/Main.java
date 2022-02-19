package eCommerceDemo;

import eCommerceDemo.business.abstracts.UserSevice;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.core.concretes.GoogleManagerAdapter;
import eCommerceDemo.dataAccess.concretes.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;
import eCommerceDemo.googleAccount.GoogleManager;

public class Main {

	public static void main(String[] args) {
		UserSevice userSevice = new UserManager(new HibernateUserDao(), new GoogleManagerAdapter(new GoogleManager()));
		
		User user =  new User("Fatih","Baysal","fatihhbaysal@gmail.com","1234543",true);
		
		User user2 =  new User("Berk","Uysal","berkuysal88@gmail.com","9878765",false);
		
		
		userSevice.register(user);
		userSevice.login(user);
		userSevice.loginWithEmail(user);
		userSevice.registerWithEmail(user);
		
		
		userSevice.register(user2);
		userSevice.login(user2);
		userSevice.loginWithEmail(user2);
		userSevice.registerWithEmail(user2);
		
		
		

	}

}

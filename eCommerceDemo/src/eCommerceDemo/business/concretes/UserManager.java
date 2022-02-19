package eCommerceDemo.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.business.abstracts.UserSevice;
import eCommerceDemo.core.abstracts.GoogleService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserSevice {
	
	private UserDao userDao;
	private GoogleService service;
	
	

	public UserManager(UserDao userDao, GoogleService service) {
		super();
		this.userDao = userDao;
		this.service = service;
	}
	

	@Override
	public void register(User user) {
		
		if(user.getPassword().length() < 6) {
			System.out.println("Parolaniz en az 6 karakterden olusmalidir!");
		}
		
		final String EMAIL_REGEX = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		final Pattern pattern = Pattern.compile(EMAIL_REGEX,Pattern.CASE_INSENSITIVE);
		
		Matcher matcher = pattern.matcher(user.getEmail());
		
		if(!matcher.matches()) {
			System.out.println(user.getEmail() + "Lutfen e-posta formatina uygun bir adres giriniz!");
		}
		
		for(User users : userDao.getAll()) {
			if(users.getEmail().equals(user.getEmail())) {
				System.out.println("Bu e-mail adresi zaten kayitlidir! Lutfen baska bir e-mail adresi deneyiniz.");
			}
			
			if(users.getFirstName().length() < 2 && users.getLastName().length() < 2) {
				System.out.println("Ad ve Soyad en az 2 karakterden olusmalidir!");
			}
		}
		userDao.register(user);
	}

	@Override
	public void login(User user) {
		if(user.isVerify() == true) {
			userDao.login(user);
			System.out.println("Giris basarilidir!");
			
		}else {
			System.out.println("Giris Basarisizdir!");
		}
		
	}

	@Override
	public void confirm(User user) {
		if(user.isVerify() == true) {
			userDao.confirm(user);
			System.out.println(user.getEmail() + " E-mail adresiniz basarili bir sekilde dogrulanmistir.");
		}else {
			System.out.println(user.getEmail() + " E-mail adresiniz dogrulanamadi!");
		}
		
	}

	@Override
	public void registerWithEmail(User user) {
		user.setVerify(true);
		this.service.register(user);
		
	}

	@Override
	public void loginWithEmail(User user) {
		if(user.isVerify() == true ) {
			this.service.login(user);
		}else {
			System.out.println("Lutfen sisteme kayit olunuz!");
		}
	}
}

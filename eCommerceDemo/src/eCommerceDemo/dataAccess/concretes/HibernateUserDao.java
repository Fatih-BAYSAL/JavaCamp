package eCommerceDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	List<User> users = new ArrayList<User>();

	@Override
	public void deleteUser(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " isimli kullanici basarili bir sekilde silindi!");
		
	}

	@Override
	public void updateUser(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " isimli kullanici basarili bir sekilde guncellendi!");
		
	}

	@Override
	public void register(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " isimli kullanici basarili bir sekilde kayit oldu!");
		
	}

	@Override
	public void confirm(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " isimli kullanici basarili bir sekilde onaylandi!");
		
	}

	@Override
	public void login(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " isimli kullanici basarili bir sekilde giris yapti!");
		
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}

}

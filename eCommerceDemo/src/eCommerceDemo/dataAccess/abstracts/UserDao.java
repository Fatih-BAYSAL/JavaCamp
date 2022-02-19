package eCommerceDemo.dataAccess.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.User;

public interface UserDao {
	
	void deleteUser(User user);
	void updateUser(User user);
	void register(User user);
	void confirm(User user);
	void login(User user);
	
	List<User> getAll();
	

}

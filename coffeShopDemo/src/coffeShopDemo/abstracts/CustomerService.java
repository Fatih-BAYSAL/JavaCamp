package coffeShopDemo.abstracts;

import java.rmi.RemoteException;

import coffeShopDemo.entities.Customer;

public interface CustomerService {
	
	void save(Customer customer) throws NumberFormatException, RemoteException;

}

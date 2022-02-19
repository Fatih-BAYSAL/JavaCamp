package coffeShopDemo.concretes;

import java.rmi.RemoteException;

import coffeShopDemo.abstracts.CustomerService;
import coffeShopDemo.entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		System.out.println("Save to db : " +customer.getFirstName());
		
	}

}

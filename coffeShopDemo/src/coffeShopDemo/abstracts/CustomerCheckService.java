package coffeShopDemo.abstracts;

import java.rmi.RemoteException;

import coffeShopDemo.entities.Customer;

public interface CustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;

}

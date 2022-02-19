package coffeShopDemo.concretes;

import java.rmi.RemoteException;

import coffeShopDemo.abstracts.CustomerCheckService;
import coffeShopDemo.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	
	CustomerCheckService checkService;

	public StarbucksCustomerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}
	
	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		if(checkService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Hatali kullanici girisi!");
		}
		
	}
	
	

}

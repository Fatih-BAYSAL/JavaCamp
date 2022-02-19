package coffeShopDemo.concretes;

import coffeShopDemo.abstracts.CustomerCheckService;
import coffeShopDemo.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}

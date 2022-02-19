package coffeShopDemo.adapters;

import java.rmi.RemoteException;

import coffeShopDemo.abstracts.CustomerCheckService;
import coffeShopDemo.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
	
	
     KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
	
	
	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId),customer.firstName.toUpperCase(), customer.lastName.toUpperCase(), customer.dateOfBirth);
		
		if(result == true) {
			System.out.println("Basarili bir sekilde dogrulandi");
			return true;
		}else {
			System.out.println("Basarisiz!");
			return false;
		}
		
	}

}

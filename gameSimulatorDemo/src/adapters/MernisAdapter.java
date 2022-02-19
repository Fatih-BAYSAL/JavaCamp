package adapters;

import java.rmi.RemoteException;

import abstracts.PersonCheckService;
import entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements PersonCheckService{

	@Override
	public boolean checkIfRealPerson(Player player) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getFirstName(), player.getLastName(), player.getDateOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {

			e.printStackTrace();
		}
		return false;
	}
	
	
	

}

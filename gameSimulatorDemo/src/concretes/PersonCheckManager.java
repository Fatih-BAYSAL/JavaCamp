package concretes;

import abstracts.PersonCheckService;
import entities.Player;

public class PersonCheckManager implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		return true;
	}

}

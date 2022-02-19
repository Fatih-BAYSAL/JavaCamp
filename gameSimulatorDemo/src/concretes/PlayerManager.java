package concretes;

import abstracts.PersonCheckService;
import abstracts.PlayerService;
import entities.Player;

public class PlayerManager implements PlayerService {
	
	PersonCheckService checkService;
	

	public PlayerManager(PersonCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void add(Player player) {
		if(checkService.checkIfRealPerson(player)) {
			System.out.println("Player added : " + player.getFirstName());
		}else {
			System.out.println("Operation is fail!");
		}
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Updated to player name : " +player.getFirstName()+" "+player.getLastName());
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Deleted to player name : " +player.getFirstName()+" "+player.getLastName());
		
	}

}

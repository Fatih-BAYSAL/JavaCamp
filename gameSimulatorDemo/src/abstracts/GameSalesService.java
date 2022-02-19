package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Player;

public interface GameSalesService {
	
	void sales(Player player, Game game, Campaign campaign);

}

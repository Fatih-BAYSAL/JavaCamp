package concretes;

import abstracts.GameSalesService;
import entities.Campaign;
import entities.Game;
import entities.Player;

public class GameSalesManager implements GameSalesService {

	@Override
	public void sales(Player player, Game game, Campaign campaign) {
		double price = game.getGamePrice() - (game.getGamePrice() * campaign.getCampaignRate());
		
		System.out.println(game.getGameName() +" "+ "game sold to " + player.getFirstName()+" "+"player price : " +price);
		
	}

}

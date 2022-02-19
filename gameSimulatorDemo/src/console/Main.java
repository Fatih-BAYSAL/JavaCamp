package console;

import java.time.LocalDate;

import abstracts.PersonCheckService;
import adapters.MernisAdapter;
import concretes.CampaignManager;
import concretes.GameManager;
import concretes.GameSalesManager;
import concretes.PlayerManager;
import entities.Campaign;
import entities.Game;
import entities.Player;

public class Main {

	public static void main(String[] args) {
		
		
		Player player = new Player();
		player.setId(1);
		player.setFirstName("Fatih");
		player.setLastName("Baysal");
		player.setDateOfBirth(LocalDate.of(1887, 2, 10));
		player.setNationalityId("9999999999");
		
		
		PlayerManager playerManager = new PlayerManager(new MernisAdapter());
		playerManager.add(player);
		
		Game game = new Game();
		game.setId(0);
		game.setGameName("Grand Turismo");
		game.setGamePrice(450);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		
		Campaign campaign = new Campaign();
		campaign.setId(0);
		campaign.setCampaignRate(0.80);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		
		PersonCheckService playerCheckService = new MernisAdapter();
		
		GameSalesManager gameSalesManager = new GameSalesManager();
		
		if(playerCheckService.checkIfRealPerson(player) == true) {
			gameSalesManager.sales(player, game, campaign);
		}else {
			System.out.println("Not a valid person");
		}
		
	
	}

}

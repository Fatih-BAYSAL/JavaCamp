package concretes;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Game to save : " +game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Game to update : " +game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game to delete : " +game.getGameName());
		
	}

}

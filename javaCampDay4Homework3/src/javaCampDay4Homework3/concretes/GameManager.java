package javaCampDay4Homework3.concretes;

import javaCampDay4Homework3.abstracts.GameManagementService;
import javaCampDay4Homework3.entities.Game;

public class GameManager implements GameManagementService {

	@Override
	public void addGame(Game game) {
		System.out.println("Game added: " + game.getGameName());
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println("Game deleted: " + game.getGameName());
		
	}

	@Override
	public void updateGame(Game game) {
		System.out.println("Game updated: " + game.getGameName());
		
	}

}

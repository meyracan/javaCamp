package javaCampDay4Homework3.abstracts;

import javaCampDay4Homework3.entities.Game;

public interface GameManagementService {
	
	void addGame(Game game);
	void deleteGame(Game game);
	void updateGame(Game game);

}

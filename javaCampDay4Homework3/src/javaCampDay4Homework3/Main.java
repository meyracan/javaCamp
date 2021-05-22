package javaCampDay4Homework3;

import java.time.LocalDate;

import javaCampDay4Homework3.adapters.MernisServiceAdapter;
import javaCampDay4Homework3.concretes.CampaignManager;
import javaCampDay4Homework3.concretes.GameManager;
import javaCampDay4Homework3.concretes.SaleManager;
import javaCampDay4Homework3.concretes.UserManager;
import javaCampDay4Homework3.entities.Campaign;
import javaCampDay4Homework3.entities.Game;
import javaCampDay4Homework3.entities.User;

public class Main {

	public static void main(String[] args) {
		 
		User user1 = new User("1111111111", "Meyra", "Can",LocalDate.of(1999,8,26));
		User user2 = new User("0000000000", "Engin", "Demiroð",LocalDate.of(1985,8,26));
		UserManager usermanager = new UserManager(new MernisServiceAdapter());
		
		usermanager.addNewUser(user1);
		usermanager.deleteUser(user2);
		
		
		Game game1 = new Game(1, "Valorant", 1200);
		GameManager gameManager = new GameManager();
		gameManager.addGame(game1);
		
		Campaign campaign1 = new Campaign(1, "Winter Campaign", 500);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign1);
		
		SaleManager saleManager = new SaleManager();
		saleManager.saleWithCampaign(user1, game1, campaign1);

	}

}

package javaCampDay4Homework3.concretes;

import javaCampDay4Homework3.abstracts.SaleManagementService;
import javaCampDay4Homework3.entities.Campaign;
import javaCampDay4Homework3.entities.Game;
import javaCampDay4Homework3.entities.User;

public class SaleManager implements SaleManagementService {

	@Override
	public void sale(User user, Game game) {
		System.out.println(game.getGameName() + " is sold to " + user.getFirstName());
		
	}

	@Override
	public void saleWithCampaign(User user, Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " is sold to " + user.getFirstName() + " with the " + campaign.getCampaignName());
		float priceAfterCampaign = game.getUnitPrice()-campaign.getDiscount();
		System.out.println("The price after campaign is:" + priceAfterCampaign);
	}

}

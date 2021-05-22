package javaCampDay4Homework3.abstracts;

import javaCampDay4Homework3.entities.Campaign;
import javaCampDay4Homework3.entities.Game;
import javaCampDay4Homework3.entities.User;

public interface SaleManagementService {
	void sale(User user, Game game);
	void saleWithCampaign(User user, Game game, Campaign campaign);

}

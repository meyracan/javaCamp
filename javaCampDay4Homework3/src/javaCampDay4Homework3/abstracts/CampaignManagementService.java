package javaCampDay4Homework3.abstracts;

import javaCampDay4Homework3.entities.Campaign;

public interface CampaignManagementService {
	
	void addCampaign(Campaign campaign);
	void deleteCampaign(Campaign campaign);
	void updateCampaign(Campaign campaign);

}

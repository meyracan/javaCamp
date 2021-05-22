package javaCampDay4Homework3.concretes;

import javaCampDay4Homework3.abstracts.CampaignManagementService;
import javaCampDay4Homework3.entities.Campaign;

public class CampaignManager implements CampaignManagementService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Campaign added: " + campaign.getCampaignName());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Campaign deleted: " + campaign.getCampaignName());
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Campaign updated: " + campaign.getCampaignName());
		
	}

}

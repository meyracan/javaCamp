package javaCampDay4Homework3.entities;

import javaCampDay4Homework3.abstracts.Entity;

public class Campaign implements Entity{
	private int id;
	private String campaignName;
	private float discount;
	
	public Campaign() {
	}
	public Campaign(int id, String campaignName, float discount) {
		this.id = id;
		this.campaignName = campaignName;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}
	

}

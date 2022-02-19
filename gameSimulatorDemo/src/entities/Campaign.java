package entities;

import abstracts.Entity;

public class Campaign implements Entity {
	
	private int id;
	private double campaignRate;
	
	public Campaign() {
		super();
	}

	public Campaign(int id, double campaignRate) {
		super();
		this.id = id;
		this.campaignRate = campaignRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCampaignRate() {
		return campaignRate;
	}

	public void setCampaignRate(double campaignRate) {
		this.campaignRate = campaignRate;
	}
	

}

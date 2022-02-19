package concretes;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Added campaign");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Updated campaign");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Deleted campaign");
		
	}

}

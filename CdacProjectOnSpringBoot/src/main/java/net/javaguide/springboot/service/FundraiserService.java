package net.javaguide.springboot.service;

import java.util.List;

import net.javaguide.springboot.model.Fundraiser;

public interface FundraiserService {
	
	Fundraiser saveFundraiser( Fundraiser fundraiser);
	
	List<Fundraiser> getAllFundraiser();
	
	Fundraiser getFundraiserById(long fundraiserid);
	
	Fundraiser updateFundraiser(Fundraiser fundraiser,long fundraiserid);

}

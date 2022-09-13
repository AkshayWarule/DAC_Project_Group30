package net.javaguide.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import net.javaguide.springboot.exception.ResourceNotFoundException;
import net.javaguide.springboot.model.Fundraiser;
import net.javaguide.springboot.repository.FundraiserRepository;
import net.javaguide.springboot.service.FundraiserService;

@Service
public class FundraiserServiceImpl implements FundraiserService {

	private FundraiserRepository fundraiserRepository;
	
	
	public FundraiserServiceImpl(FundraiserRepository fundraiserRepository) {
		super();
		this.fundraiserRepository = fundraiserRepository;
	}


	@Override
	public Fundraiser saveFundraiser(Fundraiser fundraiser) {
		// TODO Auto-generated method stub
		return fundraiserRepository.save(fundraiser);
	}


	@Override
	public List<Fundraiser> getAllFundraiser() {
		// TODO Auto-generated method stub
		System.out.println("fund service method");
		return fundraiserRepository.findAll() ;

	      	
	}

/*
	public Fundraiser getFundraiserById(long id) {
		return  fundraiserRepository.findById(id).orElseThrow(() ->new ResourceNotFoundException("Fundraiser", "Id", id));
		}

*/
	@Override
	public Fundraiser getFundraiserById(long fundraiserid) {
		// TODO Auto-generated method stub
		return fundraiserRepository.findById(fundraiserid).orElseThrow(() ->new ResourceNotFoundException("Fundraiser", "Id", fundraiserid));
	}

      
	@Override
	public Fundraiser updateFundraiser(Fundraiser fundraiser, long fundraiserid) {
		// TODO Auto-generated method stub
		return null;
	}
		
		
	}
	



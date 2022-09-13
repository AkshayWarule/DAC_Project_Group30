package net.javaguide.springboot.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguide.springboot.model.Fundraiser;
import net.javaguide.springboot.service.FundraiserService;

@RestController
@RequestMapping("/api/fundraiser")
public class FundraiserController {
	
	private FundraiserService fundraiserService;

	public FundraiserController(FundraiserService fundraiserService) {
		super();
		this.fundraiserService = fundraiserService;
	}
	
	
	//build create employee Rest Api
	
	@PostMapping
	public ResponseEntity<Fundraiser> saveFundraiser(@RequestBody Fundraiser fundraiser)
	{
		return new ResponseEntity<Fundraiser>(fundraiserService.saveFundraiser(fundraiser), HttpStatus.CREATED);
	}

	// get all fundraiser 
	@GetMapping
	public List<Fundraiser> getAllFundraiser(){
		System.out.println(fundraiserService.getAllFundraiser());
		return fundraiserService.getAllFundraiser();
		
	}
	
	//get by id
	@GetMapping("{id}")
	public ResponseEntity<Fundraiser> getFundraiserById(@PathVariable("id") long fundraiserid)
	{
		return new ResponseEntity<Fundraiser>(fundraiserService.getFundraiserById(fundraiserid),HttpStatus.OK);
	}
	
	//update
	
	
	
}

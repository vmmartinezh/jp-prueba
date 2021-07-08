package com.jp.az.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jp.az.model.CountryValidationRequest;
import com.jp.az.model.CountryValidationResponse;

@RestController
@RequestMapping("/risk-management")
public class GeolocationController {
	
	
	
	@PostMapping(path = "/black-lists/country/validation")
	public ResponseEntity<CountryValidationResponse> countryValidation(
			@RequestHeader(name = "Authorization", required = true) String authorization,
			@RequestHeader(name = "subscription-key", required = true) String subscriptionKey, 
			@RequestBody CountryValidationRequest request){
		
		return new ResponseEntity<CountryValidationResponse>(new CountryValidationResponse(false), HttpStatus.OK);
	}


}
